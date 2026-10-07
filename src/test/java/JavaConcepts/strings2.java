package JavaConcepts;

public class strings2 {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbl = new StringBuilder("World!!!");
        String s = "Hi there!!";
        StringBuilder sbl2 = new StringBuilder(s); //Converting String to StringBuilder
        /*
        These are mutable
         */
        System.out.println(sbl2.hashCode());
        sbl2 = sbl2.append(" Naresh IT");
        System.out.println(sbl2);
        System.out.println(sbl2.hashCode());
        System.out.println(sbl2.reverse());
        System.out.println(sbl2.length());
        System.out.println(sbl2.replace(1,5,"xxxxxx"));
        System.out.println(sbl2.delete(1,5));
        System.out.println(sbl2.deleteCharAt(2));
    }
}
