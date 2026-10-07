package Bhanu29;

public class odd {
    public static void main(String[] args) {

        int[] j ={11,22,33,44,55,66,77,88,99,100};
            System.out.println("print odd indexes:");
            for ( int i= 0; i < j.length; i++){
                if(i%2!=0) {

                    System.out.println(j[i]);
                }
            }
        }
    }
