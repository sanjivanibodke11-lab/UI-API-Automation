package Dineshrao.JavaConcepts;

import java.util.ArrayList;

public class ArrayToArrayList {
    public void arraytoarraylist(){
        int []a={1,2,3,4,5};
        System.out.println(a[1]);
        ArrayList<Integer> al=new ArrayList<>();
        for(int count:a){
            al.add(count);
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        ArrayToArrayList atl=new ArrayToArrayList();
        atl.arraytoarraylist();
    }
}
