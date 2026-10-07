package Prangya;

public class ArrayCheck {
    public void check(int[] a, int[] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++) {
                if ((a[i] == b[j])) {
                    System.out.println("Both are same");
                }
                    System.out.println("Both are not same");
            }}}
    public static void main(String[] args) {
        int a[]={1,2,4,5,7};
        int b[]={2,8,9,10};
        ArrayCheck ac=new ArrayCheck();
        ac.check(a,b);


    }
}
