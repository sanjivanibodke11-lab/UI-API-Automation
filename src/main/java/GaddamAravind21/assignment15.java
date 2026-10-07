package GaddamAravind21;

public class assignment15 {

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
        assignment15 a1 = new assignment15();
        String s = "AravindGaddam";
        s = s.toLowerCase();
        a1.vowels(s);


    }
    }
