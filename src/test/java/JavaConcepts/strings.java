package JavaConcepts;

public class strings {
    public static void main(String[] args) {
        String s = "Naresh IT";
        String s1 = new String("Hello World!!!!");

        String a = s.toLowerCase();
        System.out.println(a);

        String b = s.toUpperCase();
        System.out.println(b);

        int i = s.length();
        boolean bool = s.startsWith("N");
        System.out.println(s.endsWith("t"));

        String x = " Hello World!! ";
        System.out.println(x.hashCode());
        System.out.println(x.length());
        x = x.trim();
        //Strings are immutable
        System.out.println(x.hashCode());
        System.out.println(x.length());
        System.out.println(x);

        System.out.println(s.contains("It"));
        System.out.println(s.equals("Naresh IT"));
        /*
        == for equality  b/w Primitives
        equals() for equality b/w Non-Primitive
         */
        System.out.println(s.equalsIgnoreCase("naREsh It"));
        char ch = s.charAt(3);
        char[] c = s.toCharArray();

        s.split(" "); //splits at a whitespace
        System.out.println(s.replace("IT","Software"));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s.concat(" Ameerpet"));
        System.out.println(s.concat(" Ameerpet Hyderabad"));
    }
}
