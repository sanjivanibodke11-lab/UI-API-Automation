package Bhanu29;

public class arrayslenght {
    public void arrays(int[]m,int[]n){
        if (m.length==n.length){
            System.out.println("arrays lenghtare same");
        }
        else{
            System.out.println("arrays are different lenght");
        }
    }

    public static void main(String[] args) {
        arrayslenght ar=new arrayslenght();
        int[] m = {3,5,6,9};
        int[] n = {2,4,8,10,11};
        ar.arrays(m,n);
    }
}
