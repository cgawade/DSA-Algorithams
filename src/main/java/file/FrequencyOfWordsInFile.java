package file;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class FrequencyOfWordsInFile {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordFrequencyMap = getWordFrequencyMap("/tmp/words.txt");
        System.out.println(wordFrequencyMap);

        List<Map.Entry<String, Integer>> list = sortMapBasedOnValues(wordFrequencyMap);
        System.out.println(list);

        System.out.println("Maximum Frequency Word : "+list.get(0).getKey());

    }

    private static Map<String ,Integer> getWordFrequencyMap(String fileName) throws IOException {

        Map<String ,Integer> wordMap = new HashMap<>();

        /*
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line1 = null;
        while ((line1 = reader.readLine()) != null){
            System.out.println(line1);
        }
        */

        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream))) {

            Pattern pattern = Pattern.compile("\\s+");
            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                line = line.toLowerCase();
                String words[] = pattern.split(line);
                for (String word : words){
                    if (wordMap.containsKey(word))
                        wordMap.put(word, wordMap.get(word) + 1);
                    else{
                        wordMap.put(word, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordMap;
    }

    public static List<Map.Entry<String, Integer>> sortMapBasedOnValues(Map<String, Integer> wordMap){
        //Set<Map.Entry<String, Integer>> entries = wordMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordMap.entrySet());

        /*
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        */

        //OR
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        return list;
    }
}
