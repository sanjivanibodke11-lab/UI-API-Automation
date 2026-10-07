package anitha;

public class CountVowels {
    public static void CountVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
     public static void main(String[]args){
         String s = "HANISH";
         CountVowels(s);

     }

}





//