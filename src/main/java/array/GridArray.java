package array;

public class GridArray {
    public static void main(String[] args) {
        int A[] = {0,1,1};
        int B[] = {0,1,2};

        int steps = coverPoints(A, B);
        System.out.println(steps);
    }

    public static int coverPoints(int[] A, int[] B) {
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            res = res + Math.max(Math.abs(A[i] - A[i + 1]), Math.abs(B[i] - B[i + 1]));
            System.out.println(res);
        }
        return res;
    }
}
