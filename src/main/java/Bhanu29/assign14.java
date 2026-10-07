package Bhanu29;

public class assign14 {
    public void reverse(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String l = "BUN MASKA";
        assign14 hi = new assign14();
        char[] c = l.toCharArray();
        hi.reverse(c);
    }
}
