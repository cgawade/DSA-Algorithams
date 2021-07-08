package strings;

public class StringPalindrom {
    public static void main(String[] args) {
        String str = "ABABA";
        boolean palindrom = isPalindrom(str);
        System.out.println("is Palindrom : "+ palindrom);
    }

    private static boolean isPalindrom(String str) {
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
