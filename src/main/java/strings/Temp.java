package strings;

import java.util.HashSet;
import java.util.TreeSet;

public class Temp {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        set.add("Shekhar");
        set.add("Amol");
        set.add("Bala");
        System.out.println(set);

        HashSet<Object> set1 = new HashSet<>();
        set1.add("Shekhar");
        set1.add("Amol");
        set1.add("Bala");
        System.out.println(set1);

    }
}
