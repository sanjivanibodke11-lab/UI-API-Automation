package koti;

public class A_index {
    public static void inde(int[] a,int[] b){
        if(a.length==b.length){
            System.out.println("same length");
        }
        else{
            System.out.println("not same length");
        }
    }

public static void main(String[] args){
    A_index s= new A_index();
    int[]a={1,2,3,4,5};
    int[]b={6,7,8,9};
    s.inde(a,b);
}
}