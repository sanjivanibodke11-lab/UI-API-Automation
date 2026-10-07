package GaddamAravind21;

public class assignment11 {
    void check(int[] a){

        for(int i=0;i<a.length;i++) {
            if (a[i] == 10) {
                System.out.println("the number 10 is present ");
                return;
            }
        }
        System.out.println("the number is not present");
    }
    public static void main(String[] args) {
        assignment11 a1=new assignment11();
        int[] a={1,2,3,4,5,6,7,8,9,10};
        a1.check(a);

    }
}
