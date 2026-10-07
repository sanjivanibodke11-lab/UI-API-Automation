package yasmin;

public class method
{
    public int a(int [] x)
    {
        int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==10)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        method m=new method();
        int [] x={19,98,89,10,79,107,9,10,10,};
        System.out.println(m.a(x));
    }
}
