package supriya_kottam;

public class Assignment15 {
    String s ="sUpriyA";
    int count;
    public void vowel(){
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Assignment15 a = new Assignment15();
        a.vowel();
    }
}
