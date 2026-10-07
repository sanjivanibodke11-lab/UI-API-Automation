package Prangya;

public class CheckElement {
    public int type(int[] a,int y) {
        int count=0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == y ){
                count++;
                continue;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int x[]={1,2,3,4,5,10,6,7,8,9,10};
        int a=10;
        CheckElement rt=new CheckElement();
        int y;
        y= rt.type(x,a);
        System.out.println(y);

    }
}
