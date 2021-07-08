package array;

/*
Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array.
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
n = 1
A[] = {1}
Output: 1
Explanation: Since its the only
element hence its the only equilibrium
point.


Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case
equilibrium point is at position 3
as elements before it (1+3) =
elements after it (2+2).

 */


public class EquilibriumPoint {
    public static void main(String[] args) {
        long arr[]={4, 42, 27, 16, 28, 3, 4, 5, 9, 3, 31, 5, 5, 2,   9, 10, 18, 35, 35, 33, 19, 41, 23, 8, 32, 9, 5, 8, 18, 35, 13, 6, 7, 6, 10, 11, 13, 37, 2, 25, 7, 28, 43};
        int point = equilibriumPoint(arr, arr.length);
        System.out.println("Equilibrium point : "+point);
    }

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    private static int equilibriumPoint(long[] arr, int n) {
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        long sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum2 = sum2 + arr[i];
            sum = sum - arr[i];

            if (sum == sum2)
                return i+1;
        }

        return -1;

    }

}
