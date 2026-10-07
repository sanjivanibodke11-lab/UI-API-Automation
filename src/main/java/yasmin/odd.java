package yasmin;

public class odd {
    public static void main(String[] args){

        int[] i = {1,2,3,4,5,6,7,8,9,10};


        for(int a = 0; a < i.length; a++) {


            if (i[a] % 2 != 0) {
                System.out.println(i[a]);
            }
        }  }
}
