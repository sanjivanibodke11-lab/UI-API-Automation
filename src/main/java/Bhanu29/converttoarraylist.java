package Bhanu29;

import java.util.ArrayList;

public class converttoarraylist {
    public ArrayList<Integer> array(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        return list;
    }

    public static void main(String[] args) {
       converttoarraylist ar = new converttoarraylist();
        int[] b = {1, 2, 3, 4, 5};
        ArrayList<Integer> covertedarraylist = ar.array(b);
        System.out.println(covertedarraylist);
    }
}

