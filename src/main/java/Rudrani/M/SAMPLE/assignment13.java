package Rudrani.M.SAMPLE;

public class assignment13 {
    public void compare2arrays() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 5, 4, 7, 8, 9};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        assignment13 ca= new assignment13();
        ca.compare2arrays();
    }
}
