package strings;

public class FindAllPalindromSubstring {
    public static void main(String[] args) {
        String str = "shekharraaabcadacbiTopiNonAveevanoNipotik";
        findAllPalindromSubstring(str.toLowerCase());
    }

    private static void findAllPalindromSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean palindrom = isPalindrom(str, i, j);
                if (palindrom) {
                    System.out.println(str.substring(i, j+1));
                }
            }
        }
    }

    private static boolean isPalindrom(String str, int i, int j) {
        while (i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
