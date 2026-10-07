package Shifali_Rajurkar;
public class sumofNumEvenOdd {
    public void sumOfNumber(int x, int y) {
        int sum = x + y;
        if (sum % 2 == 0) {
            System.out.println("Sum of Two Number is Even = " + sum);
        } else {
            System.out.println("Sum of Two Number is Odd = " + sum);
        }
    }
    public static void main(String[] args) {
        sumofNumEvenOdd obj = new sumofNumEvenOdd();
        obj.sumOfNumber(10, 9);
    }
}

