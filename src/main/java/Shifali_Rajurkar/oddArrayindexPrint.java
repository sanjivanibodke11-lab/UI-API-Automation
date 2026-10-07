package Shifali_Rajurkar;

public class oddArrayindexPrint {
    public static void main(String[] args) {
        int[] a = {12, 65, 23, 35, 76, 89, 26, 188, 154};
        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println("Odd data-->" + a[i]);
        }
    }
}
