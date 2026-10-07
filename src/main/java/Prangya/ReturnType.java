package Prangya;

public class ReturnType {
    public boolean type(int[] a,int y) {
        boolean x = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == y ){
                 x = true;
                break;
            }
        }
        return x;
    }

    public static void main(String[] args){
        int x[]={1,2,3,4,5,6,7,8,9,10};
        int a=10;
        ReturnType rt=new ReturnType();
         boolean y;
         y= rt.type(x,a);
         System.out.println(y);

    }
}
