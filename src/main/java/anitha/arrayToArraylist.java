package anitha;
import java.util.ArrayList;

public class arrayToArraylist {
    public static void coverteToarray(int[] arraydata) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arraydata.length; i++) {
            al.add(arraydata[i]);
        }
        System.out.println("Array List data = " + al);
    }
    public static void main(String args[]) {
        arrayToArraylist obj = new arrayToArraylist();
        int arr[] = {10,20,40,55};
        obj.coverteToarray(arr);
    }
}
