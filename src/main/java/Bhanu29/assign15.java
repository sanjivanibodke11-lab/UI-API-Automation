package Bhanu29;


public class assign15 {
    String b ="BhaNu";
    int count;
    public void vowel(){
        for(int i =0;i<b.length();i++){
            char ch = b.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        assign15 bh =new assign15();
        bh.vowel();
    }
}
