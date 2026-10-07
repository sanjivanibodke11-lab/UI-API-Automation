package anitha;

public class ReverseArrays {
    public static void main(String[] args) {
        int j = 5;
        System.out.println(j);

        int[] a = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        System.out.println(a[2]);
        System.out.println("=======");
        for(int i=a.length-1;i>=0 ; i--){
            System.out.println("Array in Reverse Order :: " + a[i]);
        }
    }
}

