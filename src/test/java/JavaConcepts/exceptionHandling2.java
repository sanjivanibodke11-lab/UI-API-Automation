package JavaConcepts;

public class exceptionHandling2 {
    public static void main(String[] args) throws Exception{
        System.out.println("hi");
//        try {
            Thread.sleep(5000);
//        }
//        catch(Exception e){}
        System.out.println(5/0);
        System.out.println("hello");
    }
}
