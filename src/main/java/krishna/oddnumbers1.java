package krishna;

public class oddnumbers1 {
        public static void main(String[] args) {
            int oddcount = 0;
            for(int i=0; i<=100; i += 3){

                if ( i % 2 != 0) {
                    oddcount++;
                }
                System.out.println("the number of odd numners are:" +i);
            }
        }
    }


