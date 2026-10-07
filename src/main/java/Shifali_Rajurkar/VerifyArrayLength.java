package Shifali_Rajurkar;
public class VerifyArrayLength {
    public void campareArrayLeghth(int[] x, int[] y) {
        if (x.length == y.length) {
            System.out.println(" length of two Array are same ");
        } else {
            System.out.println(" length of two Array are Not same ");
        }
    }
    public static void main(String args[]) {
        VerifyArrayLength obj = new VerifyArrayLength();
        int a[] = {12, 3, 2, 4, 6};
        int b[] = {11, 35, 62, 45};
        obj.campareArrayLeghth(a, b);
    }
}


