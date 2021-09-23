package strings;

public class RotateStringByTwoPlaces {
    public static void main(String[] args) {
//        String str1 = "amazon";
//        String str2 = "azonam";

        String str1 = "geeksforgeeks";
        String str2 = "geeksgeeksfor";

        boolean rotated = isRotated(str1, str2);
        System.out.println(rotated);
    }

    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;

        if (str1.length() <=2 && str2.length() <=2)
            if (str1.equals(str2))
                return true;
            else
                return false;


        String clockwise_rot = "";

        clockwise_rot = clockwise_rot +
                        str2.substring(str2.length()-2, str2.length()) +
                        str2.substring(0, str2.length()-2);

        System.out.println(clockwise_rot);

        if (str1.equals(clockwise_rot))
            return true;
        else
            return false;
    }
}
