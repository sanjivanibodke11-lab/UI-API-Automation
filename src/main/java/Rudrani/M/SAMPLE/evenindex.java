package Rudrani.M.SAMPLE;

public class evenindex {
    public static void main (String[] args)
    {
        int [] a = new int [10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;
        for (int i=0; i<a.length; i++){
            if(i%2==0){
                System.out.print(a[i]);
            }

    }
    }
}
