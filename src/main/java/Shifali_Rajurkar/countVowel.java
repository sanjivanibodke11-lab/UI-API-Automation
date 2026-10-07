package Shifali_Rajurkar;

public class countVowel {

    public void calculateVowel(String str){
        int count=0;
        for (int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("vowels count: "+count);
    }

    public static void main(String args[]){
        countVowel obj = new countVowel();
        String name="welcome";
        obj.calculateVowel(name);
    }
}
