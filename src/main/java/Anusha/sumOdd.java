package Anusha;

public class sumOdd{
    public void sum(int x , int y){
        int sum = x+y;
        if (sum%2!=0) {
            System.out.println("Sum of X and Y is odd:" + sum);
        }
        else {
            System.out.println("Sum of X and Y is even:" + sum);
        }
    }
    public static void main(String[] args){
        sumOdd m = new sumOdd();
        m.sum(2,5);
    }
}