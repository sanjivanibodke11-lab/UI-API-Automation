package Anusha;

public class countOddNumbers {
    public static void main(String[] arg){
        int count=0;
        for(int a=100; a>0; a--){
            if(a%2!=0){
                //  System.out.println(a);
                count++;
            }
        }
        System.out.println("number of odd numbers b/w 0 & 100 is " + count);
    }
}
