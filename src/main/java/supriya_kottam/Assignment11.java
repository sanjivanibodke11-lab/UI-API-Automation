package supriya_kottam;

public class Assignment11 {
    boolean present;
    public boolean present(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                present = true;
               break;
            }
        }
       return present;
    }
    public static void main(String[] args) {
        Assignment11 m =new Assignment11();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
       boolean x = m.present(a);
       System.out.println(x);

    }
}

