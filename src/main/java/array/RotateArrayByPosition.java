package array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByPosition {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int position = 2;
        System.out.println(rotateArray(arrayList, position));
    }

    private static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int position) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i=0; i<arr.size(); i++){
            ret.add(arr.get((i + position) % arr.size()));
        }

        return ret;
    }
}
