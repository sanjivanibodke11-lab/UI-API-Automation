package Bhanu29;

public class assign13 {
    public void compare(int [] a1,int[] a2){
        for(int i=0; i<a1.length; i++){
            for(int b=0; b<a2.length;b ++){
                if(a1[i] == a2[b]){
                    System.out.println("common elements:" +a1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        assign13 bp = new assign13();
        int[] a1 ={5,9,3,4};
        int[] a2 ={8,4,2,3};
        bp.compare(a1,a2);
    }
}

