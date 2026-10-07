package krishna;

public class comparemethod {
    public void compare(int x, int y) {
        if (x < y) {
            System.out.println("X is less than Y");
        } else if (x > y) {
            System.out.println("X is greater than Y");
        } else {
            System.out.println("X is equal to Y");
        }
    }

    public static void main(String[] args) {
        comparemethod m = new comparemethod();
        m.compare(17, 16);
    }

}
