package Anusha;

public class checkValuecount {
    int count=0;
    public int value(int[] a) {
        for(int i=0; i<a.length; i++){
            if(a[i] == 10){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        checkValuecount c = new checkValuecount();
        int[] a = {1,2,3,4,5,10,7,8,9,10};
        int result = c.value(a);
        System.out.println(result);
    }
}
