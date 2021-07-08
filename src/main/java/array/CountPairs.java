package array;

import java.util.Arrays;

/*
Given two arrays X and Y of positive integers, find the number of pairs such that xy > yx (raised to power of)
where x is an element from X and y is an element from Y.

Input:
M = 3, X[] = [2 1 6]
N = 2, Y[] = [1 5]
Output: 3
Explanation:
The pairs which follow xy > yx are
as such: 21 > 12,  25 > 52 and 61 > 16 .


Input:
M = 4, X[] = [2 3 4 5]
N = 3, Y[] = [1 2 3]
Output: 5
Explanation:
The pairs for the given input are
21 > 12 , 31 > 13 , 32 > 23 , 41 > 14 ,
51 > 15 .

 */
public class CountPairs {
    public static void main(String[] args) {
        int arr1[] = {};
        int arr2[] = {};
        countPairs(arr1, arr2, arr1.length, arr2.length);
    }

    private static void countPairs(int[] arr1, int[] arr2, int n, int m) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int element1 = arr1[i];
                int element2 = arr2[j];

                if (Math.pow(element1, element2) > Math.pow(element2, element1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
