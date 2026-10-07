package JavaConcepts;

public class returnTypes {
    /*
    in place of void we can use any
    Primitive/Non-Primitive data types
    as O/P
     */

    public int a(){
        System.out.println("5");
        return 2;
    }

    public char b(){
        return 'a'+2;
    }

    public boolean c(){
        return 2<3;
    }

    public float d(int x, float y){
        return x+y;
    }

    public static void main(String[] args) {
        /*
        Output is any value that can be
        stored in a variable
         */
        returnTypes c = new returnTypes();
        int x = c.a();
        char ch = c.b();
        System.out.println(ch);
        boolean b = c.c();
    }
}
