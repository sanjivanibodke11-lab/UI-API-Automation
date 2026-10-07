package GaddamAravind21;

import java.util.ArrayList;

public class assignment22 {
    void array(ArrayList<Integer> al){
        int [] a = new int[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]= al.get(i);
          }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        assignment22 a1 = new assignment22();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        a1.array(al);
    }
}
