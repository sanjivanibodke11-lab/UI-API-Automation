package Prangya;

public class SumOdd {
    public void sum(int a, int b){
        if((a+b)%2!=0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    public static void main(String[] args){
        SumOdd so= new SumOdd();
        so.sum(12,10);

    }
}
