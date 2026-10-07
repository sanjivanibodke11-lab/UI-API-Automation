package supriya_kottam;

public class Assignment13 {
    public void compare(int[]a, int[] b){
        for(int i=0; i<a.length ;i++){
            for(int k=0; k<b.length ;k++)
                if(a[i]==b[k]){
                    System.out.println(a[i]);
                }
        }
    }

    public static void main(String[] args){
        Assignment13 c = new Assignment13();
        int[] a = {2,3,4,5,6,7,6,10};
        int[] b = {3,8,4,9,8,7,9};
        c.compare(a,b);
    }
}
