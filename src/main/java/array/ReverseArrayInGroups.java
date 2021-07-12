package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.


Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9

 */
public class ReverseArrayInGroups {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int k = 3;
//        reverseInGroup(arr, arr.length, k);
//        Arrays.stream(arr).forEach(System.out::println);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(36, 93, 64, 48, 96, 55, 70, 0, 82, 30, 16, 22, 38, 53, 19, 50, 91, 43, 70, 88, 10, 57, 14, 94, 13, 36, 59, 32, 54, 58, 18, 82, 6));
        System.out.println(list);
        int k = 13;
        reverseInGroup(list, list.size(), k);

        System.out.println(list);
    }

    private static void reverseInGroup(int[] arr, int n, int k) {
        for (int pos = 0; pos < n; pos = pos+k) {
            int j = Integer.min((k+pos), n);
            int i = pos;
            while (i < j){
                swap(arr, i, j-1);
                //Collections.swap(list, i,j-1);
                i++;
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void reverseInGroup(ArrayList<Integer> list, int n, int k) {
        for (int pos = 0; pos < n; pos = pos+k) {
            int j = Integer.min((k+pos), n);
            int i = pos;
            System.out.println(pos+":"+k+":"+n);
            //System.out.println((k+i));
            while (i < j){
                swapV1(list, i, j-1);
                //Collections.swap(list, i,j-1);
                i++;
                j--;
            }
        }
    }

    private static void swapV1(ArrayList<Integer> arr, int i, int j) {
        Integer temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
