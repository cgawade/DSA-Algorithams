package util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayOps {

    public final static int[] ARRAY = {1,34,56,23,4,2,7,8,9,10,200,34,1,0,0,-12,456};

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swapV1(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    public static void display(int arr[], String msg) {
        System.out.println(msg +" = "+ Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
