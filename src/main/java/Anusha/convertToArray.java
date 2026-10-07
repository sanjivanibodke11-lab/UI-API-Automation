package Anusha;

import java.util.ArrayList;

public class convertToArray {
    public int [] array (ArrayList<Integer>list) {
        int [] a = new int[list.size()] ;
        for (int i=0; i<a.length; i++){
            a[i] = list.get(i);
        }
        return a;
    }
    public static void main(String[] args) {
        convertToArray ar = new convertToArray();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int[] convertedarray = ar.array(list);
        for(int i=0; i<convertedarray.length;i++){
            System.out.println(convertedarray[i]);
        }

    }
}