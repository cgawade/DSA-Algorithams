package array;

import java.util.ArrayList;

public class MaxSumNonNegativeArray {
    public static void main(String[] args) {
        int arr[] = {1000,2,3,-8,4,5,6,-12,5,1000};
        ArrayList maxSubArray = findMaxSubArray(arr);

        System.out.println(maxSubArray);
    }

    private static ArrayList findMaxSubArray(int[] arr) {
        int maxSum = 0;
        int newSum = 0;

        ArrayList<Integer> maxArray = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int element: arr){
            if (element >=0){
                newSum +=element;
                newArray.add(element);
            }else{
                newSum = 0;
                newArray = new ArrayList<>();
            }

            if ((maxSum < newSum) || (newSum == maxSum) || newArray.size() > maxArray.size()){
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}
