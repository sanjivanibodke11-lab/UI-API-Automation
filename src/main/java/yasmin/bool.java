package yasmin;

public class bool
{
    public boolean b(int []x)
    {
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==10)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        bool c=new bool();
        int []x= {1,25,7,8,9,0,10};
        System.out.println(c.b(x));
    }
}
