package sorting;

import static util.ArrayOps.ARRAY;
import static util.ArrayOps.display;

public class MergeSort {
    public static void main(String[] args) {
        mergeSort(ARRAY);
    }

    public static void mergeSort(int arr[]) {
        display(arr,"Before sort");
        split(arr, 0, arr.length-1);
        display(arr,"After sort");
    }


    private static void split(int array[], int start_index, int end_index) {
        int mid_index;

        if(start_index < end_index){
            mid_index = (start_index + end_index) / 2;
            split(array, start_index, mid_index);
            split(array, mid_index+1, end_index);
            merge(array, start_index, mid_index, end_index);
        }
    }

    private static void merge(int[] array, int start_index, int mid_index, int end_index) {
        int n1 = mid_index - start_index + 1;
        int n2 = end_index - mid_index;
        int cnt, k1,k2;

        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        for(cnt = 0; cnt<n1; cnt++){
            temp1[cnt] = array[start_index+cnt];
        }

        for(cnt = 0; cnt<n2; cnt++){
            temp2[cnt] = array[mid_index+1+cnt];
        }

        cnt = k1 = k2 = 0;

        while(cnt < n1+n2){
            if(temp1[k1] <= temp2[k2]){
                array[start_index + cnt] = temp1[k1];
                cnt++;
                k1++;
                if(k1 == n1){
                    break;
                }
            }else{
                array[start_index + cnt] = temp2[k2];
                cnt++;
                k2++;
                if(k2 == n2){
                    break;
                }
            }
        }

        while(k1 < n1){
            array[start_index + cnt] = temp1[k1];
            cnt++;
            k1++;
        }

        while (k2 < n2){
            array[start_index + cnt] = temp2[k2];
            cnt++;
            k2++;
        }

    }
}
