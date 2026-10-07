package GaddamAravind21;

public class assignment14 {

    void reverse(String s) {

        char[] a = s.toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {

        assignment14 a1 = new assignment14();

        String s = "AravindGaddam";

        a1.reverse(s);
    }
}