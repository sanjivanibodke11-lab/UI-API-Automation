package yasmin;

public class greater
{
    public void num(int a,int b)
    {
        if(a>b)
        {
            System.out.println("a is big");
        }
        else {
            System.out.println("b is big");
        }
    }
    public static void main(String[] args)
    {
        greater n=new greater();
        n.num(9,8);
    }
}
