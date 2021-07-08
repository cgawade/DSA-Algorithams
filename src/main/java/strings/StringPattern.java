package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {

    public static void main(String[] args) {
        String string = "Hi i am shekhar and my birth date is 29-11-1991 and my wife birth date is 15-08-1992";

        Set<String> set = new HashSet<>();

        Pattern pattern = Pattern.compile("(\\d{1,2}-\\d{1,2}-\\d{4}|\\d{1,2}-\\d{1,2})", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            set.add(matcher.group(0).split("-")[2]);
        }

        System.out.println(set.size());
        System.out.println(set);

    }

}
