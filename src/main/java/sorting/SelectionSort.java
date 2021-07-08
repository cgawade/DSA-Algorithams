package sorting;

import static util.ArrayOps.*;

public class SelectionSort {

    public static void main(String[] args) {
        selectionSort(ARRAY);
    }

    public static void selectionSort(int arr[]){
        display(arr,"Before sort");
        sort(arr, arr.length);
        display(arr,"After sort");
    }

    private static void sort(int[] array, int length) {
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

}
