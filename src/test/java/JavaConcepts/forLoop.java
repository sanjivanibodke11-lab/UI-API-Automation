package JavaConcepts;

public class forLoop {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("hii");
        }
        System.out.println("======");
        for(int i=0;i<11;i=i+2){
            System.out.println(i);
        }
        System.out.println("======");
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }

        for(int i=0;i<3;i++){ //3 iterations - outer loop
            for(int j=0;j<4;j++){ //3 iterations  - inner loop
                System.out.println(i+" "+j);
            }
        }
    }
}
/*
comment
 */