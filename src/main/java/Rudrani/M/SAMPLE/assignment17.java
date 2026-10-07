package Rudrani.M.SAMPLE;

public class assignment17 {
    public void commonelement(){
        String s= "Hello World!!";
        for(int i=0; i<s.length(); i++){
           char ch=s.charAt(i);
           if(s.indexOf(ch)==s.lastIndexOf(ch)){
               System.out.println(ch);
           }
        }
    }
    public static void main(String[] args){
        assignment17 ce=new assignment17();
        ce.commonelement();
    }
}
