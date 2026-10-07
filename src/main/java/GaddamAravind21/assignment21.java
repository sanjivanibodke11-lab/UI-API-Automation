package GaddamAravind21;

import java.util.*;

public class assignment21 {
    ArrayList<Integer> al = new ArrayList<Integer>();
        void list(int[] a) {
                  for (int i=0;i<a.length;i++){
                      al.add(a[i]);
                  }
            System.out.println(al);
        }

        public static void main(String[] args) {
            assignment21 a1=new assignment21();
            int[] a ={1,2,3,4,5};
            a1.list(a);
        }

}
