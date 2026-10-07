package koti;

public class A_sumarrodd {

    public   void sum(int a,int b){
            if((a+b%2) != 0){

                System.out.println("sum of a and b is odd:" );

            }
            else{
                System.out.println(" sum of a and b is not odd :");
            }
        }
        public static void main(String[] args){
            A_sumarrodd s= new A_sumarrodd();
            s.sum(2,2);
        }
    }

