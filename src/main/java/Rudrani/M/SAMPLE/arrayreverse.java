package Rudrani.M.SAMPLE;

public class arrayreverse
{
   public static void main(String[] args)
   {
       int [] a = new int [5];
       a[4]= 5;
       a[3]= 4;
       a[2]= 3;
       a[1]= 2;
       a[0]= 1;

       for (int i=a.length-1; i>= 0; i--)
           System.out.println(a[i]);

   }
}
