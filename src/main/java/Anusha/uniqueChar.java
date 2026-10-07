package Anusha;

public class uniqueChar {
    public void findUnique(String str) {
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == c){
                    count++;
                }
            }
            if(count == 1 && c!= ' '){
                System.out.println("Unique: " + c);
            }
        }
    }
    public static void main(String[] args) {
        String s = "Hello world!! Morning";
        uniqueChar uc = new uniqueChar();
        uc.findUnique(s);
    }
}