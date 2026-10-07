package JavaConcepts;

public class exceptionHandling1 {

    public static void main(String[] args) {
        int x = 5;

        System.out.println(0/x);
        try{
            System.out.println(x/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block");
        }

        System.out.println("hiiiiii");
    }
}

/*
Exception causes the program to stop abruptly.
Unchecked Exceptions: Logical issues in the code.
Ex:

Checked Exceptions:
 */
