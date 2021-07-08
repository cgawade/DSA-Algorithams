package strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringAnagram {
    public static void main(String[] args) {
        String str = "aabcde";
        String str1 = "bacaed";

        //boolean anagram = anagramV1(str,str1);
        //System.out.println(anagram);

        boolean anagram = anagramV2(str, str1);
        System.out.println(anagram);
    }

    private static boolean anagramV1(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();

        char str3[] = str1.toCharArray();
        char str4[] = str2.toCharArray();

        if (n1 != n2)
            return false;

        Arrays.sort(str3);
        Arrays.sort(str4);

        if (Arrays.equals(str3, str4))
            return true;

        return false;
    }

    private static boolean anagramV2(String str, String str1) {

        if (str.length() != str1.length())
            return false;

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            int index = ch - 'a';
            arr1[index] = arr1[index] + 1;

            ch = str1.charAt(i);
            index = ch - 'a';
            arr2[index] = arr2[index] + 1;
        }

        for (int i = 0; i < 26; i++){
            if (arr1[i] != arr2[i])
                return false;
        }

        //OR
        //return Arrays.equals(arr1,arr2);

        return true;
    }
}
