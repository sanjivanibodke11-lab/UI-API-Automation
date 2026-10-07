package GaddamAravind21;

public class assignment9 {
    void sum(int a,int b){
        int total = a+b;
        if(total%2!=0){
            System.out.println("sum of two numbers is odd");
        }
            else{
            System.out.println("sum of two numbers is even");
        }
    }
    public static void main(String[] args) {
        assignment9 a1 = new assignment9();
        a1.sum(4,1);
    }
}
