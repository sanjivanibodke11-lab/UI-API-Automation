package JavaConcepts;

public class arrays {
    public static void main(String[] args) {
        int j = 5;
        System.out.println(j);

        int[] a = new int[5];
        a[0] = 8;
        a[1] = 8;
        a[2] = 7;
        a[3] = 6;
        a[4] = 0;
//        a[5] = 9;
        System.out.println(a[2]);
        System.out.println("=======");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
