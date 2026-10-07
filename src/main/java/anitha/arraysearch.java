package anitha;

public class arraysearch {
    public static void checknumbers(int[] a, int number) {
        boolean checknumbers = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                checknumbers = true;
            }
        }
        if (checknumbers) {
            System.out.println(number + " is present in the array");
        } else {
            System.out.println(number + "is not present in the array");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        checknumbers(a, 10);
    }
}




//








