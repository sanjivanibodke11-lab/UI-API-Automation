package Bhanu29;

public class assign17 {
    String m = "Hello World!!";
    public void unique(){
        for(int i=0; i<m.length();i++){
            char k = m.charAt(i);
            if(m.indexOf(k) == m.lastIndexOf(k)){
                System.out.println(k);
            }
        }
    }
    public static void main(String[] args) {
        assign17 a = new assign17();
        a.unique();
    }
}

