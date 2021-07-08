package array;

import java.util.ArrayList;
import java.util.List;

/*
Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side.
 The rightmost element is always a leader.

Input
 n=6
 A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.


Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0

 */
public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = {63, 70, 80, 33, 33, 47, 20};
        List<Integer> list = leaders(arr, arr.length);
        System.out.println(list);
    }

    private static ArrayList<Integer> leaders(int[] arr, int n) {
        int max = 0;
        boolean flag= false;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = n-1; i >=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                flag= true;
            }

            if(flag){
                list.add(0, max);
                flag = false;
            }
        }
        return list;
    }
}
