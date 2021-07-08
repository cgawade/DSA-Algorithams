package array;

import sorting.QuickSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static util.ArrayOps.ARRAY;
import static util.ArrayOps.display;

public class FindPairWithGivenSum {
    public static void main(String[] args) {
        //findPair(ARRAY, 8);
        //findPairV1(ARRAY,8);
        findPairV2(ARRAY,8);
    }

    // Time complexity O(N^2)
    public static void findPair(int arr[], int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum) {
                    System.out.println("Pair Found at index (" + i + " , " + j + ")");
                    break;
                }
            }
        }
    }

    //Time complexity O(n.log(n))
    public static void findPairV1(int arr[], int sum){
        //sort the array first
        Arrays.sort(arr);
        display(arr,"Array");

        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            if(arr[low]+arr[high] == sum){
                System.out.println("Pair Found at index (" + low + " , " + high + ")");
                return;
            }else if(arr[low]+arr[high] < sum){
                low++;
            }else{
                high --;
            }
        }

        System.out.println("Pair Not Found");
    }

    // Time complexity O(n)
    private static void findPairV2(int arr[], int sum){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum-arr[i])){
                System.out.println("Pair Found at index ("+map.get(sum-arr[i])+","+i+")");
                return;
            }else{
                map.put(arr[i],i);
            }
        }

        System.out.println("Pair Not Found");
    }

}
