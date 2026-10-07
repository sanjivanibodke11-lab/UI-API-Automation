package Anusha;

public class arrayLength{
    public void array(int[] x , int[] y){
        if (x.length == y.length) {
            System.out.println("X and Y are same length ");
        }
        else{
            System.out.println("X and Y are not same length");
        }
    }
    public static void main(String[] args){
        arrayLength m = new arrayLength();
        int [] x = {1,2,4,5};
        int [] y = {1,4,5,6};
        m.array(x,y);
    }
}