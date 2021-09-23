package strings;

public class LongestPalindromSubstring {
    public static void main(String[] args) {
        String str = "shekharraaabcadacbiTopiNonAveevanoNipotik";
        //String str = "CBxyzyxABA";

        System.out.println("itopinonavevanonipoti".length());
        int length = longestSubstringPalindrom(str.toLowerCase());
        System.out.println("Length of longest substring : "+ length);
    }

    private static int longestSubstringPalindrom(String str) {
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int p1,p2;
            p1=p2=i;

           while (p1 >= 0 && p2 < str.length() && str.charAt(p1) == str.charAt(p2)){
               p1--;
               p2++;
           }

           max = Math.max(max, p2-p1-1);
        }

        for (int i = 0; i < str.length(); i++) {
            int p1,p2;
            p1=i;
            p2=i+1;

            while (p1 >= 0 && p2 < str.length() && str.charAt(p1) == str.charAt(p2)){
                p1--;
                p2++;
            }

            max = Math.max(max, p2-p1-1);
        }

        return max;
    }
}
