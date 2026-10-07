package JavaConcepts;

import java.util.ArrayList;
import JavaConcepts.subPackage.*;

public class arrayList extends sampleClass{
    public static void main(String[] args) {
        int[] a = new int[5];
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(7);
        al.add(6);
        al.add(6);
        al.add(0);
        System.out.println(al);
        System.out.println(al.get(4));
        System.out.println(al.size());
        al.remove(1);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(9));
        System.out.println(al.indexOf(6));
        System.out.println(al.lastIndexOf(6));

        for( int i=0; i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("=================");
        for(int i: al){
            System.out.println(i);
        }

        sampleClass sc = new sampleClass();
//        sc.protectedMethod();
        arrayList all = new arrayList();
        all.protectedMethod();
    }
}
