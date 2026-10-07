package Shifali_Rajurkar;
public class elementPresentArray {
    int count = 0;

    public int checkNumber(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        elementPresentArray obj = new elementPresentArray();
        int[] x = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9, 10};
        int result = obj.checkNumber(x);
        System.out.println("Count-->> " + result);
    }
}
