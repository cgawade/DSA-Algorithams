package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,5,8,23,56,78,100};
        int arr2[] = {3,5,12,27,88,127};
        int mergeArray []= merge(arr1,arr2);
        Arrays.stream(mergeArray).forEach(System.out::println);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int cnt, k1, k2;
        cnt=k1=k2=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergeArray[] = new int[n1+n2];

        while (cnt < (n1+n2-1)){
            if (arr1[k1] <= arr2[k2]){
                mergeArray[cnt] = arr1[k1];
                cnt++;
                k1++;
            }else{
                mergeArray[cnt] = arr2[k2];
                cnt++;
                k2++;
            }
        }

        while (k1 < n1){
            mergeArray[cnt] = arr1[k1];
            cnt++;
            k1++;
        }

        while (k2 < n2){
            mergeArray[cnt] = arr2[k2];
            cnt++;
            k2++;
        }

        return mergeArray;
    }
}
