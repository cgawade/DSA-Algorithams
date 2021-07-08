package sorting;

import static util.ArrayOps.*;

public class QuickSort {
    public static void main(String[] args) {
        quickSort(ARRAY);
    }

    public static void quickSort(int arr[]) {
        display(arr,"Before Sort");
        sort(arr, 0, arr.length-1);
        display(arr,"After Sort");
    }

    private static void sort(int[] arr, int start_index, int end_index) {

        if(start_index >= end_index)
            return;

        int pivotIndex = partition(arr, start_index, end_index);
        sort(arr, start_index, pivotIndex - 1);
        sort(arr, pivotIndex + 1, end_index);

    }


    private static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int l = low;
        int h= high;

        while(l < h){
            while(arr[l] <= pivot && l < h)
                l++;

            while(arr[h] > pivot)
                h--;

            if(l < h)
                swap(arr, l ,h);
        }
        swap(arr, low, h);
        return h;
    }

}
