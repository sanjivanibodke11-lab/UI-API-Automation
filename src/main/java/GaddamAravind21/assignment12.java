package GaddamAravind21;

public class assignment12 {
    void count(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                total++;
            }
        }
        System.out.println(total);
    }
        public static void main (String[]args){
                assignment12 a1= new assignment12();
                int[] a={1,2,3,10,10,5,10,6,7,8,9,10};
                      a1.count(a);
        }
    }

