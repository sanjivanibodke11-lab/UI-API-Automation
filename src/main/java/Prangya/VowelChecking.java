package Prangya;

public class VowelChecking {
    void vowels(String s) {
        char[] d = s.toCharArray();
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if ((d[i] == v[j])) {
                    System.out.println(d[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        VowelChecking a1 = new VowelChecking();
        String s = "Prangya";
        s = s.toLowerCase();
        a1.vowels(s);


    }
}
