package anitha;

public class countnumber {
    public static void countnumber(int[] a, int number) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                count++;
            }
        }
        System.out.println(number + " is available " + count + " times");

    }
    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 10};

        countnumber(a, 10);

    }

}



//