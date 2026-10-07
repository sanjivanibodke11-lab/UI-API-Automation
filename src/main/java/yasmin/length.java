package yasmin;

public class length
{
    public void l(int [] a, int [] b)
    {
        if(a.length==b.length)
        {
            System.out.println("the length of both arrays are same");
        }
        else {
            System.out.println("the length of both arrays are not same");
        }
    }
    public static void main(String[] args)
    {
        length r=new length();
        int []a={1,2,7};
        int []b={4,5,0,4};
        r.l(a,b);
    }
}
