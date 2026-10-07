package Anusha;

public class compareValues{
    public void compare(int a, int b){
        if(a>b){
            System.out.println("a is greaterthan b");
        }
        else {
            System.out.println("a is lessthan b");
        }
    }
    public static void main(String[] args){
        compareValues m = new compareValues();
        m.compare(25,3);
    }
}