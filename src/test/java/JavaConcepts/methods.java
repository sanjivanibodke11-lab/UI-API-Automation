package JavaConcepts;

public class methods {

    public void vote() { //no parameter method
        int a = 26;
        if (a >= 18) {
            System.out.println("eligible & age is : "+a);
        } else {
            System.out.println("Not eligible");
        }
    }

    public void paramVote(int x){
        if(x>=18){
            System.out.println("Eligible: "+x);
        }
        else{
            System.out.println("Not eligible: "+x);
        }
    }

    public void a(int x, int y){
        System.out.println(x+y);
    }


    public void c(int[] x){
        System.out.println(x.length);
    }

    public static void main(String[] args) {
        methods m = new methods();
        m.vote();
        m.vote();
        m.paramVote(17);
        m.paramVote(18);
        m.paramVote(22);
        m.a(1,2);
        int[] x = {1,2,3,4,5};
        m.c(x);
        accessModifiers am = new accessModifiers();
        am.smallMethod();
        //        int a = 19;
//        if(a>=18){
//            System.out.println("eligible");
//        }
//        else{
//            System.out.println("Not eligible");
//        }
//
//        int b = 25;
//        if(b>=18){
//            System.out.println("eligible");
//        }
//        else{
//            System.out.println("Not eligible");
//        }
//
//        int c = 58;
//        if(c>=18){
//            System.out.println("eligible");
//        }
//        else{
//            System.out.println("Not eligible");
//        }
//    }
    }
}
