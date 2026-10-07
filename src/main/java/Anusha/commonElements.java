package Anusha;

public class commonElements {
    public void compare(int [] a1,int[] a2){
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length;j ++){
                if(a1[i] == a2[j]){
                    System.out.println("common elements:" +a1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        commonElements ca = new commonElements();
        int[] a1 ={1,3,4,2};
        int[] a2 ={1,6,5,2};
        ca.compare(a1,a2);
    }
}
