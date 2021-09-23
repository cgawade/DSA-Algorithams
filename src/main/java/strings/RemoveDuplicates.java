package strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcadcfdgdgdbcvsdfsdadssad";
        String uniqueCharacter = removeDuplicates(str);
        System.out.println(uniqueCharacter);
    }

    private static String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                builder.append(ch);
            }
        }

        System.out.println(set);
        return builder.toString();
    }
}
