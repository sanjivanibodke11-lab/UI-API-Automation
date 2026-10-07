package supriya_kottam;

public class Assignment7 {
    public static void main(String[] args){
        int[] odd = {12,13,14,15,16,17,18,19,20,21};
        for(int i=0; i<odd.length; i++){
            if(i %2 != 0) {
                System.out.println(odd[i]);
            }
        }
    }
}
