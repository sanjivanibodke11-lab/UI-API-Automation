package JavaConcepts;

public class breakContinue {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==4){
                System.out.println("time to break");
                break; //exits the loop
//                System.out.println("");
            }
        }
        System.out.println("Out of for loop");
        for(int i=0;i<10;i++){
            if(i==4){
                continue; //skips the iteration
            }
            System.out.println(i);
        }
    }
}
