package array;

import java.util.ArrayList;
import java.util.Arrays;

public class PredictOutput {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(9,10,11,12));

        A.add(a1);
        A.add(a2);
        A.add(a3);


        ArrayList<ArrayList<Integer>> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }

    }

    private static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            System.out.println(B);

            for (int j = 0; j < A.get(i).size(); j++) {
                System.out.println((A.get(i).size() - 1 - j+" : "+ A.get(i).get(j)));
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }


}
