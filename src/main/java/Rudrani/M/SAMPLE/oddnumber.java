package Rudrani.M.SAMPLE;

public class oddnumber {
    public static void main(String[] args){
        int countodd=0;
        for (int i=0; i<=100; i++){
            if (i % 2 == 1){
               countodd ++ ;
           }
        }
        System.out.println(countodd);
    }
}
