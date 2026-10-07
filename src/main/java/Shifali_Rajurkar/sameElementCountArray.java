package Shifali_Rajurkar;
public class sameElementCountArray {
    public boolean checkNumber(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Shifali_Rajurkar.sameElementCountArray obj = new sameElementCountArray();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = obj.checkNumber(x);
        System.out.println(result);
    }
}
