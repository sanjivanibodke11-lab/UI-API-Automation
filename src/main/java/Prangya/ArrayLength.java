package Prangya;

public class ArrayLength {
    public void lenth(int[] a, int[] b){
        if((a.length==b.length))
            System.out.println("Both length same");
        else System.out.println("Both length not same");
    }
    public static void main(String[] args){
        ArrayLength al=new ArrayLength();
        int x[]={1,2,3,4,5};
        int y[]={5,6,7,8};
        al.lenth(x,y);

    }
}
