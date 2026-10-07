package supriya_kottam;

public class Assignment14 {
    String s = "Supriya";
    public void reverse(){
        for(int i =s.length()-1; i>=0 ;i--){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Assignment14 m = new Assignment14();
        m.reverse();
    }
}
