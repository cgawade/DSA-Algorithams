package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumSubarrayProblem {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arr1[] = {-2, -1, -3, -4, -1, -2, 1, 5, -2, 100, 2,3,55};
        int maximumSum = maximumSum(arr1);
        System.out.println("Maximum Sum : "+ maximumSum);
    }


    private static int maximumSum(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();


        if(max < 0){
            return max;
        }

        // stores the maximum sum subarray found so for
        int maxSoFar = 0;

        // stores the maximum sum of subarray ending at the current position
        int maxEndingHere = 0;

        ArrayList<Integer> currentList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();

        for(int i : arr){

            // update the maximum sum of subarray "ending" at index `i` (by adding the
            // current element to maximum sum ending at previous index `i-1`)
            maxEndingHere = maxEndingHere + i;
            currentList.add(i);

            // if the maximum sum is negative, set it to 0 (which represents
            // an empty subarray)
            maxEndingHere = Integer.max(maxEndingHere, 0);
            if(maxEndingHere == 0)
                currentList = new ArrayList<>();

            maxSoFar = Integer.max(maxEndingHere, maxSoFar);

            if(maxSoFar == maxEndingHere)
                maxList = currentList;
        }

        System.out.println("Maximum sum array "+maxList);
        return maxSoFar;
    }
}
