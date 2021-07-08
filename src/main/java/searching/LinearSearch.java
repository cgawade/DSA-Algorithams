package searching;

import static util.ArrayOps.ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        linearSearch(ARRAY,8);
    }

    private static void linearSearch(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                System.out.println("Element found at index : "+i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }
}
