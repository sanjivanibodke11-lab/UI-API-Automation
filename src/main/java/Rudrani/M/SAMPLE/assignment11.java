package Rudrani.M.SAMPLE;
public class assignment11 {

    public void countarray() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        boolean ispresent = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10)
                ispresent = true;
        }

        if (ispresent)
            System.out.println("10 is present");
        else
            System.out.println("10 is not present");
    }

    public static void main(String[] args) {
        assignment11 obj = new assignment11();
        obj.countarray();
    }
}