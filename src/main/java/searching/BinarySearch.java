package searching;

import java.util.Arrays;

import static util.ArrayOps.ARRAY;
import static util.ArrayOps.display;

public class BinarySearch {
    public static void main(String[] args) {
        display(ARRAY,"Array");
        binarySearch(Arrays.stream(ARRAY).sorted().toArray(), -12);
    }

    private static void binarySearch(int[] array, int elem) {
        int pos = search(array, 0, array.length-1, elem);

        if (pos != -1)
            System.out.println("Element found at position "+pos);
        else
            System.out.println("Not found");
    }


    private static int search(int[] array, int start, int end, int elem) {

        if(start <= end) {
            int mid = start + (end-start)/2;

            if (array[mid] == elem)
                return mid;

            if (array[mid] > elem)
                return search(array, start, mid - 1, elem);

            return search(array, mid + 1, end, elem);

        }

        return -1;
    }
}
