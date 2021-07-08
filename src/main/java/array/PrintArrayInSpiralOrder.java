package array;

public class PrintArrayInSpiralOrder {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(arr);
    }

    public static void spiralOrder(final int[][] A) {
        int t=0, b=A.length-1, l=0, r=A[0].length-1;
        int dir =0;

        while(t <= b && l <= r){
            if(dir == 0){
                for(int k = l; k <= r; k++) {
                    System.out.println(A[t][k]);
                }
                t++;
            }else if(dir == 1){
                for(int k = t; k<=b; k++){
                    System.out.println(A[k][r]);
                }
                r--;
            }else if(dir == 2){
                for(int k=r; k>=l; k--){
                    System.out.println(A[b][k]);
                }
                b--;
            }else if(dir == 3){
                for(int k=b; k>=t; k--){
                    System.out.println(A[k][l]);
                }
                l++;
            }
            dir = (dir+1)%4;
        }

    }
}
