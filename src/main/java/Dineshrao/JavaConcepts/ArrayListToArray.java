package Dineshrao.JavaConcepts;

import java.util.ArrayList;

public class ArrayListToArray {
    public void alta(){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(101);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(5000);
        System.out.println(al);


        Integer[] array=al.toArray(new Integer[al.size()]);
        for(Integer count:array){
              int  abc=count.intValue();
            System.out.println(abc);
            
        }



    }
    public static void main(String[] args) {
        ArrayListToArray altl=new ArrayListToArray();
        altl.alta();

    }
}
