package JavaConcepts;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"ABC");
        hm.put(2,"BCD");
        hm.put(2,"CDE");
        hm.put(3,"CDE");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get(3));
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsValue("ABC"));
    }
}
