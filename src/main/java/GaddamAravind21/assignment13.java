package GaddamAravind21;

public class assignment13 {

    void compare(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        assignment13 a1 = new assignment13();

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {1,3,4,5,6,7,8,9,9,5};

        a1.compare(a, b);
    }
}