package yasmin;

public class sum
{
    public void n(int x, int y)
    {
        if(x+y%2!=0)
        {
            System.out.println(" sum of 2 numbers is odd");
        }
        else {
            System.out.println(" sum of 2 numbers is even");
        }
    }
    public static void main(String[] args)
    {
        sum s=new sum();
        s.n(5,4);
    }
}
