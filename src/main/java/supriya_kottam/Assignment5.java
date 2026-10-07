package supriya_kottam;

public class Assignment5 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        for(int i=8; i<a.length; i--){
            if (i == -1) {
                break;
            }
            System.out.println(a[i]);
        }
    }
}
