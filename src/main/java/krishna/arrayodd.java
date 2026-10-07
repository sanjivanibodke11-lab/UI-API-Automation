package krishna;

public class arrayodd {
    public static void main(String[] args) {
        int[] a = {9, 6, 5, 23, 45, 65, 76, 44, 544, 22};

        int Count = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) {
                Count++;
                System.out.println(a[i]);
            }
        }
    }
}
