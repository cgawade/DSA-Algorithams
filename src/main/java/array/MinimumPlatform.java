package array;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;

        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int count = 1;
        int platformNeeded = 1;
        int i = 1, j = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while(i < n && j < n){
            if (arr[i] <= dep[j]){
                platformNeeded++;
                i++;
            }else if(arr[i] > dep[j]){
                platformNeeded--;
                j++;
            }

            count = Integer.max(count, platformNeeded);
        }

        return count;
    }
}
