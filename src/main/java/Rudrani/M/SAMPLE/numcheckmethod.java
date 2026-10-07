package Rudrani.M.SAMPLE;

public class numcheckmethod {
    public void greaternumber(int a, int b){
        if(a>b){
            System.out.println("a is greater number");
        } else if (b>a){
            System.out.println("b is greater number");
        }else{
            System.out.println("no number is greater");
        }
    }
    public static void main(String[]  args){
        numcheckmethod g = new numcheckmethod();
        g.greaternumber(1,2);

    }
}
