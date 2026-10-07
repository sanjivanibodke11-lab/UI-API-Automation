package Shifali_Rajurkar;

import java.util.ArrayList;


import java.util.ArrayList;
public class arraylistToArray {

    public void listToArray(ArrayList<Integer> list){

        Integer[] arr = new Integer[list.size()];
        for (int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array data "+arr[i]);
        }

    }
    public static  void  main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(98);
        list.add(12);
        list.add(125);
        list.add(62);
        arraylistToArray obj=new arraylistToArray();
        obj.listToArray(list);
    }
}