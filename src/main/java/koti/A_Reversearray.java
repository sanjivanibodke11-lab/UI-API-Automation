package koti;

public class A_Reversearray {

        public static void main(String[] args){

            int[] b={1,2,3,4,5,6,7,8,9};
            for(int i=8; i<b.length; i--){
                if (i == -1) {
                    break;
                }
                System.out.println(b[i]);
            }
        }
    }

