package strings;

public class StringContainsNumericDigit {
    public static void main(String[] args) {
        String str = "1234567a";
        boolean containsDigit = isContainsDigit(str);

        System.out.println(containsDigit);
    }

    private static boolean isContainsDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch > 46 && ch < 57))
                return false;
        }
        return true;
    }
}
