package strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Shekhar";
        String reverseString = reverseString(str, "");
        System.out.println(reverseString);
    }

    private static String reverseString(String str, String ans) {
            if (str.length() == 0)
                return ans;
            else{
                char ch = str.charAt(str.length()-1);
                String remainingString = str.substring(0, str.length()-1);
                return reverseString(remainingString, ans + ch);
            }
    }
}
