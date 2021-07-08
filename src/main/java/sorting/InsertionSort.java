package sorting;

import static util.ArrayOps.*;

public class InsertionSort {

    public static void main(String[] args) {
        insertionSort(ARRAY);
    }

    public static void insertionSort(int arr[]) {
        display(arr,"Before Sort");
        sort(arr, arr.length);
        display(arr,"After Sort");
    }

    private static void sort(int[] array, int length) {
        for (int i = 0; i < length-1; i++){
            for (int j = i+1; j > 0; j--){
                if(array[j] > array[j-1]){
                    swap(array, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
