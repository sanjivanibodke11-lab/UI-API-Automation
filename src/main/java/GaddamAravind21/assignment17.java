package GaddamAravind21;

public class assignment17 {
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
        assignment17 a1 =new assignment17();
        String s="Hello World!!";
        a1.print(s);
    }
}
