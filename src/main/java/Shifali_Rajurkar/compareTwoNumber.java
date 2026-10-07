package Shifali_Rajurkar;
public class compareTwoNumber {
    public void compareNum(int x, int y) {
        if (x > y) {
            System.out.println("X is greter than y-->" + x);
        } else {
            System.out.println("Y is greter than X--> " + y);
        }
    }

    public static void main(String[] args) {
        compareTwoNumber obj = new compareTwoNumber();
        obj.compareNum(10, 8);
    }
}
