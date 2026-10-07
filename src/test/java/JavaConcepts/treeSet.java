package JavaConcepts;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(10);
        ts.add(7);
        ts.add(1);
        ts.add(2);
        ts.add(-1);
        System.out.println(ts);
        System.out.println(ts.isEmpty());
        System.out.println(ts.size());
//        ts.add(null);
        System.out.println(ts);
    }
}
