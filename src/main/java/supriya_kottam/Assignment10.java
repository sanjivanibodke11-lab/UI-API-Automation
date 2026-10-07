package supriya_kottam;

public class Assignment10 {
    public void same(int[] a, int[] b){
        if(a.length == b.length){
            System.out.println("length of array a and b is same");
        }else
        {
            System.out.println("length of array a and b is not same");
        }
    }
    public static void main(String[] args) {
        Assignment10 X = new Assignment10();
        int[] a = {1,2,3,4,8,9,6,11};
        int[] b = {8,9,0,1,6,7};
        X.same(a,b);

    }
}
