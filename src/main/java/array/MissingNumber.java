package array;

public class MissingNumber {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,5};
        int arr[] = {1,2,3,4,5,6,8,9,10};
        int num = missingNumber(arr, 10);
        System.out.println("Missing number : "+num);

        num = missingNumberV1(arr, 10);
        System.out.println("Missing number : "+num);

    }

    static int missingNumber(int array[], int n) {
        // Your Code Here
        int actualSum = 0;
        for(int i = 1; i <=n; i++){
            actualSum = actualSum + i;
        }

        int totalSum = 0;
        for(int i=0; i<n-1; i++){
            totalSum = totalSum + array[i];
        }

        return actualSum - totalSum;
    }

    static int missingNumberV1(int array[], int n) {
        // Your Code Here
        int total = ((n) * (n+1)) / 2;

        for(int i=0; i<n-1; i++){
            total = total - array[i];
        }

        return total;
    }
}
