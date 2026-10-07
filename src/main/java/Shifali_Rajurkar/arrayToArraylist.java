package Shifali_Rajurkar;

import java.util.ArrayList;


public class arrayToArraylist {
    public void convertToArray(int[] arraydata) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arraydata.length; i++) {
            list.add(arraydata[i]);
        }
        System.out.println("Array List data = " + list);
    }

    public static void main(String args[]) {
        arrayToArraylist obj = new arrayToArraylist();
        int arr[] = {10, 23, 54};
        obj.convertToArray(arr);
    }
}