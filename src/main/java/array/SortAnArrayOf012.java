package array;

import java.util.Arrays;

public class SortAnArrayOf012 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,2,0};
        sort012(arr, arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void sortArray(int[] arr, int n) {
        int low= 0, mid=0, high= n-1;

        while(mid <= high){
            if (arr[low] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1) {
                mid++;
            } else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void sort012(int a[], int n)
    {
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[low]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}
