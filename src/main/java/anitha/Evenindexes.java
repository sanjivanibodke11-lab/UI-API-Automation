package anitha;

public class Evenindexes {
    public static void main(String[] args) {
        int[] even = {2,4,6,8,10,12,14,16,18,20};
        for (int i = 0; i < even.length; i+=2) {
            if (even[i] % 2 == 0) {
                System.out.println(even[i]);
            }
            }


        }
    }
