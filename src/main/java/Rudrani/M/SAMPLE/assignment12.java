package Rudrani.M.SAMPLE;

public class assignment12 {

        public void countarray() {
            int[] a = {1,2,3,4,5,10,6,7,8,9,10};
            int count = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == 10)
                    count++;
            }

            System.out.println("10 is present " + count + " times");
        }

        public static void main(String[] args) {
            assignment12 obj = new assignment12();
            obj.countarray();
        }
    }

