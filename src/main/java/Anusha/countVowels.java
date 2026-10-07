package Anusha;

public class countVowels {
    public void vowels(char[] str) {
        int count=0;
        for (int i=0; i<str.length;i++) {
            char c = Character.toLowerCase(str[i]);
            if(c=='a' || c=='e' ||c=='i'|| c=='o' || c=='u'){
                System.out.println("vowel found: " + str[i]);
                count++;
            }
        }
        System.out.println("Total Vowels count: " + count);
    }
    public static void main(String[] args) {
        String s = "Anusha";
        countVowels cv = new countVowels();
        char[] b = s.toCharArray();
        cv.vowels(b);
    }
}