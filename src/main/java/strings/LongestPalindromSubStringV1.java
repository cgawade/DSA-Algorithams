package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromSubStringV1 {
    public static void main(String[] args) {
        String str = "aaaabbaa";
        //String str = "CBxyzyxABA";

        String string = longestPalin(str.toLowerCase());
        System.out.println("longest substring : "+ string);
    }

    static String longestPalin(String S){
        // code here
        StringBuilder builder = new StringBuilder();
        int max = 0;

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            int p1,p2;
            p1=p2=i;

            while (p1 >= 0 && p2 < S.length() && S.charAt(p1) == S.charAt(p2)){
                p1--;
                p2++;
            }

            if (p1 == S.length()-1) {
                map.put(p2 - p1 - 1, S.substring(p1, p2));
                if (max < (p2 - p1 - 1)){
                    max = p2 - p1 - 1;
                    builder = new StringBuilder();
                    builder.append(S.substring(p1, p2));
                }
            }
            else {
                map.put(p2 - p1 - 1, S.substring(p1 + 1, p2));
                if (max < (p2 - p1 - 1)){
                    max = p2 - p1 - 1;
                    builder = new StringBuilder();
                    builder.append(S.substring(p1 + 1, p2));
                }
            }

        }


        for (int i = 0; i < S.length(); i++) {
            int p1,p2;
            p1=i;
            p2=i+1;

            while (p1 >= 0 && p2 < S.length() && S.charAt(p1) == S.charAt(p2)){
                p1--;
                p2++;
            }

            if (p1 == S.length()-1) {
                map.put(p2 - p1 - 1, S.substring(p1, p2));
                if (max < (p2 - p1 - 1)){
                    max = p2 - p1 - 1;
                    builder = new StringBuilder();
                    builder.append(S.substring(p1, p2));
                }
            }
            else {
                map.put(p2 - p1 - 1, S.substring(p1 + 1, p2));
                if (max < (p2 - p1 - 1)){
                    max = p2 - p1 - 1;
                    builder = new StringBuilder();
                    builder.append(S.substring(p1 + 1, p2));
                }
            }
        }

        System.out.println(map);

        return builder.toString();
    }
}
