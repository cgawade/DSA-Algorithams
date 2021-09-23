package array;


import static util.ArrayOps.swap;

public class TwoDArraySort {
    public static void main(String[] args) {
        int arr[][] = {{5,3},{2,6},{-1,0},{9,2}};
        sortByXAxis(arr);
    }

    private static void sortByXAxis(int[][] arr) {
        System.out.println(arr[0].length);
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-i-1; j++) {
                if (arr[i][j] > arr[i][j+1]){
                    //swap(arr, i, j+1);
                }
            }
        }
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    private static void swap(int[][] arr, int i, int j) {
//        int temp = arr[i][j];
//        arr[i][j] = arr[][]
//    }
}
