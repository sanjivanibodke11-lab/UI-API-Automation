package Shifali_Rajurkar;
public class evenArrayIndexPrint {
    public static void main(String args[]) {
        int[] a = {1, 3, 23, 83, 43, 89, 32};
        for (int i = 0; i <= a.length; i = i + 2) {
            System.out.println("even index data-->" + a[i]);
        }
    }
}
