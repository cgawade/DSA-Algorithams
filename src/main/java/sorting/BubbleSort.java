package sorting;

import static util.ArrayOps.*;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(ARRAY);
    }

    public static int [] bubbleSort(int arr[]) {
        display(arr,"Before sort");
        sort(arr, arr.length);
        display(arr,"After sort");
        return arr;
    }

    private static void sort(int[] array, int length) {
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length-i-1; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }
}
