package Shifali_Rajurkar;
public class evenOddNumber {
    public static void main(String[] args) {
        int limit = 100;
        int evencount = 0, oddcount = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Even Number" + evencount);
        System.out.println("Odd Number" + oddcount);
    }
}





