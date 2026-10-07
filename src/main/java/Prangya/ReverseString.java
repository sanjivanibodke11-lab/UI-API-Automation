package Prangya;

public class ReverseString {
    public void reverse(char[] c){
        for(int i=c.length-1;i>=0;i--){
            System.out.println(c[i]);
        }
    }

    public static void main(String[] args) {
      String s1="Prangya";
      char c1[]=s1.toCharArray();
      ReverseString rv=new ReverseString();
      rv.reverse(c1);
    }
}
