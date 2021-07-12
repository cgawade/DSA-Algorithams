package array;

/*
Given an array arr[] and a number K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.


Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given
array is 15.

*/

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int smallestNumber = kthSmallestElement(arr, arr.length, k);
        System.out.println(k+" smallest number : "+smallestNumber);
    }

    private static int kthSmallestElement(int[] arr, int n, int k) {
        Arrays.sort(arr);
        return arr[n-k-1];
    }
}
