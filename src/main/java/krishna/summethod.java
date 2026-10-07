package krishna;

public class summethod {
    public void compare(int x, int y) {
        if ((x + y) % 2 != 0) {
            System.out.println("the sum of two numbers is odd ");
        } else {
            System.out.println("the sum of two numbers is even");
        }
    }

    public static void main(String[] args) {
        summethod m = new summethod();
        m.compare(3,0);
    }
}
