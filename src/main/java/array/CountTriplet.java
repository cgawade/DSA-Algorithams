package array;

import java.util.Arrays;

/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
1 + 2 = 3 and 3 +2 = 5
 */
public class CountTriplet {
    public static void main(String[] args) {
        int arr[] = {1,5,3,2};
        int count = countTriplet(arr, arr.length);
        System.out.println("Count : "+count);
    }

    private static int countTriplet(int[] arr, int length) {
        Arrays.sort(arr);
        int ans = 0;

        for (int i = length-1; i > 0; i--) {
            int j = 0;
            int k = i-1;

            while (j < k){
                if (arr[i] == arr[j]+arr[k]){
                    ans++;
                    j++;
                    k--;
                }else if (arr[i] > arr[j]+ arr[k]){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}
