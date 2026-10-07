package Prangya;

public class UniqueWords {
    void print(String s){
        char[] p=s.toCharArray();
        for(int i=0;i<p.length;i++){
            int count=0;
            for(int j=0;j<p.length;j++) {
                if (p[i] == p[j]) {
                    count++;
                }

            }
            if(count==1){
                System.out.println(p[i]);
            }

        }
    }

    public static void main(String[] args) {
        UniqueWords a1 =new UniqueWords();
        String s="Hello World!!";
        a1.print(s);
    }
}
