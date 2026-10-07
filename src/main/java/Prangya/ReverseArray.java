package Prangya;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 5;
        a[2] = 7;
        a[3] = 6;
        a[4] = 8;

        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
