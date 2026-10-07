package Prangya;

public class MethodCompare {
    public void compare(int a, int b) {
        if (a > b)
            System.out.println(a + "is greater than" + b);
        else
            System.out.println(a + "is not greater than" + b);
    }
        public static void main(String[] args)
        {
            MethodCompare m = new MethodCompare();
            m.compare(67,23);

        }
    }

