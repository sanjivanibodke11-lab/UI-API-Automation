package supriya_kottam;

public class Assignment9 {
    public void sum(int a, int b) {
        if ((a + b) % 2 != 0) {
            System.out.println(" sum of a and b is odd number: " +(a+b));
        } else {
            System.out.println("sum of a and b is not odd number: " +(a+b));
        }
    }
    public static void main(String[] args) {
        Assignment9 Y = new Assignment9();
        Y.sum(11, 20);
    }
}
