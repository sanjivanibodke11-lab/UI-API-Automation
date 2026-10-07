package JavaConcepts;

import java.util.Scanner;

public class scannerConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next(); //till the first whitespace

        String s = sc.nextLine();

        System.out.println(s);
    }
}
