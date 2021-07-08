package strings;

public class StringDecrypt {
    public static void main(String[] args) {
        String str = "a1b2c3";
        String ch = decrypt(str, 4);
        System.out.println(ch);
    }

    private static String decrypt(String str, int n) {
        int length = 0;
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {
            length = 0;
            if (Character.isDigit(str.charAt(j))){
                length = str.charAt(j) - 48;
            }

            for (int i = 0; i < length; i++){
                builder.append(str.charAt(j-1));
            }
        }

        System.out.println(builder.toString());
        if (builder.length() < n)
            return "-1";
        else
            return builder.charAt(n)+"";
    }
}
