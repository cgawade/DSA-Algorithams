package array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[]= {3,4,7,2,-3,1,4,2};
        int k = 7;
        int count = subArraySum(arr, k);
        System.out.println("Total count : "+count);
    }

    private static int subArraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum-k))
                count = count + 1; //map.get(sum-k);

            //map.put(sum, map.getOrDefault(sum, 0) + 1);
            map.put(sum, 1);
        }
        return count;
    }
}
