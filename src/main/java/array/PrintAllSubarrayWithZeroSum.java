package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllSubarrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        //printZeroSumSubArrayV1(arr, arr.length);
        printZeroSumSubArrayV2(arr, arr.length);
    }

    private static void printZeroSumSubArrayV1(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
             sum = sum + arr[j];
             if (sum == 0)
                 System.out.println("Subarray ["+i+ " , "+j+"]");
            }
        }
    }

    private static void printZeroSumSubArrayV2(int[] arr, int length) {
        Map<Integer, List<Integer>>  hashMap = new HashMap<>();

        insert(hashMap, 0, -1);

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];

            if (hashMap.containsKey(sum)){
                List<Integer> list = hashMap.get(sum);

                for (int value : list){
                    System.out.println("Subarray [" + (value + 1) + "…" +
                            i + "]");
                }
            }

            insert(hashMap, sum, i);
        }
    }



      private static void insert(Map<Integer, List<Integer>> hashMap, int key, int value){
       hashMap.putIfAbsent(key, new ArrayList<>());
       hashMap.get(key).add(value);
      }


}
