package JavaConcepts;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("ABC");
        hs.add("xyz");
        hs.add("abc");
        hs.add("xyz");
        hs.add("123");
        hs.add("PQR");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("XYZ"));
        hs.remove("PQR");
        hs.add(null);
        System.out.println(hs);
        for(String s: hs){
            System.out.println(s);
        }
    }
}
