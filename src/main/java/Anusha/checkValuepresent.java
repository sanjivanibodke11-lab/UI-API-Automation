package Anusha;

public class checkValuepresent {
    public boolean value(int[] a) {
        for(int i=0; i<a.length; i++){
            if(a[i] == 10){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        checkValuepresent c = new checkValuepresent();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        boolean result = c.value(a);
        System.out.println(result);
    }
}