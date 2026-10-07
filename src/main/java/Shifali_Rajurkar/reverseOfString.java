package Shifali_Rajurkar;

public class reverseOfString {
    public void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
    public  static  void main(String args[]){
        reverseOfString obj = new reverseOfString();
        String name="welcome";
        obj.reverseString(name);
    }
}
