package anitha;

public class ReverseString {
    public static void ReverseString(String s){
        for(int i= s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[]args){
        String s = "ANITHA";
        ReverseString(s);
    }
}



//