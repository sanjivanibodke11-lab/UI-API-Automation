package koti;

public class A_greather {

    public void ab(int a, int b){

        if(a>b){
            System.out.println("a is greather than b");
        }
        else{
            System.out.println("b is greather than a");
        }
    }
    public static void main(String[] args){
        A_greather s = new A_greather();
        s.ab(50,60);

    }
}