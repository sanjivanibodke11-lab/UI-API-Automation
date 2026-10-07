package anitha;
import java.util.ArrayList;

public class arraylistToArray {
    public void listToArray(ArrayList<Integer> list){
      int[] arr = new int [list.size()];
        for( int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array data " + arr[i]);
        }
    }
    public static  void  main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(15);
        list.add(55);
        list.add(90);
        arraylistToArray obj=new arraylistToArray();
        obj.listToArray(list);
    }
}
