package Bhanu29;

public class oddeven {
    public static void num(int x, int y){
        if ((x+y)% 2!=0){
            System.out.println("sumo two numbers is odd");
        }
        else {
            System.out.println("sum two numbers is even");
        }
    }

    public static void main(String[] args) {
        oddeven ed =  new oddeven();
        ed.num(22,45);
        ed.num(12,18);
    }
}







