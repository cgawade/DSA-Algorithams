package array;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8};
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
        rearrangeArray(arr, arr.length);
    }

    private static void rearrangeArray(int[] arr, int n) {
        int newArr[] = new int[n];
        int evnCnt = 0;
        int oddCnt = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                newArr[i] = arr[n - evnCnt - 1];
                evnCnt++;
            }
            else{
                newArr[i] = arr[oddCnt];
                oddCnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}
