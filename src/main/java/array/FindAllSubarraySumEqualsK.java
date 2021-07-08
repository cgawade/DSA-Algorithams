package array;

import java.util.HashMap;
import java.util.Map;

public class FindAllSubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[]= {7,3,4,7,2,-3,1,4,2};
        int k = 7;
        Map<Integer, String> arraySum = subArraySum(arr, k);
        System.out.println(arraySum.values());

        //subArraySumV1(arr,k);
        findSingleSubarray(arr, k);
    }

    private static Map<Integer,String> subArraySum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        Map<Integer, String> resultMap = new HashMap<>();

        //map.put(0, 0);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - k)){
                resultMap.put(count++,  map.get(sum-k)+1 +":"+i);
            }

            map.put(sum, i);
        }
        System.out.println(map);
        return resultMap;
    }

//    private static Map<Integer, Integer> subArraySumV1(int arr[], int k){
//        int sum = 0;
//        int start = 0;
//        int end = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//
//            if (sum >= k){
//                end = i;
//
//                while (k < sum && start < end){
//                    sum = sum - arr[start];
//                    ++start;
//                }
//
//                if (sum == k){
//                    map.put(start+1, end+1);
//                    System.out.println(map);
//                }
//            }
//        }
//        System.out.println(map);
//        return map;
//    }

    public static void findSingleSubarray(int arr[], int k){
        int sum = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k){
                System.out.println("Subarray "+ left+":"+i);
            }

            if (sum > k){
                while(sum > k){
                    sum -= arr[left];
                    left++;
                }
                if (sum == k){
                    System.out.println("Subarray "+ left+":"+i);
                }
            }
        }
    }

}
