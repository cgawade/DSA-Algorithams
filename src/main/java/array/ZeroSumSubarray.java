package array;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        //findZeroSumSubArrayV1(arr, arr.length);
        findZeroSumSubArrayV2(arr, arr.length);

    }

    // Naive Approach
    // Time Complexity O(n^2)
    private static void findZeroSumSubArrayV1(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum = sum + arr[j];
                if (sum == 0){
                    System.out.println("Zero sum subarray ("+i+" , "+j+")");
                    //break;
                }
            }
        }
    }

    private static void findZeroSumSubArrayV2(int[] arr, int length) {

        // { 3, 5, -7, 3, 1, 3, 1, -4, -2, -2 };

        Set<Integer> set = new HashSet<>();
        set.add(0);

        int sum = 0;

        for (int value: arr)
        {
            sum += value;

            if (set.contains(sum)) {
                System.out.println("Subarray found");
                break;
            }

            set.add(sum);

        }
    }
}
