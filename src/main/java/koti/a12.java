package koti;



public class a12 {
    int count;

    public int b(int[] a) {
        for (int i = 0; i <a.length; i++) {
            if (a[i] == 10) {
                count++;            }
        }
        return count;
    }


    public static void main(String[] args) {
        a12 yes = new a12();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 10, 8, 10,9, 10};

        int x = yes.b(a);
        System.out.println(x);
    }
}