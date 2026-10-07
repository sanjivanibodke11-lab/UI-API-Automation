package GaddamAravind21;

public class assignment2 {
        public static void main(String[] args) {

            char gender = 'f';
            int age = 20;

            if (gender == 'M' && age >= 18) {
                System.out.println("Eligible");
            }
            else if (gender == 'F' && age >= 21) {
                System.out.println("Eligible");
            }
            else {
                System.out.println("Not Eligible");
            }
        }
    }

