package supriya_kottam;

public class Assignment17 {
    String s = "Hello World!!";
    public void unique(){
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        Assignment17 a = new Assignment17();
        a.unique();
    }
}
