package JavaConcepts;

public class ifCondition {
    public static void main(String[] args) {
        int a = 1, b= 2;
        System.out.println("Hi");
        if(a>b){ //if-block
            System.out.println("a>b");
        }
        if(a==b){
            System.out.println("a<b");
        }
        else{
            System.out.println("hehehehe");
        }

        if(a==b){
            System.out.println("a==b");
        }
        else if(a!=b){
            System.out.println("a>=b");
        }
        else if (a<=b){
            System.out.println("a<=b");
        }
        else{
            System.out.println("else block");
        }
        System.out.println("Hey");

        if(true){ //nested if
            if(false){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
        }
        else{
            /*
            if(){}
             */
            System.out.println("this is else");
        }
    }
}
