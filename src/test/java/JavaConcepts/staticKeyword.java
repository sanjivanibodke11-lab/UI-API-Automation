package JavaConcepts;

public class staticKeyword {
    int i =5;
    static int si = 4;

    public void a(){
        System.out.println("Void a");
    }

    public static void b(){
        System.out.println("Void b");
    }

    static{
        System.out.println("Static block");
    }

    static{
        System.out.println("Static block2");
    }

    public static void main(String[] args) {
        staticKeyword sk=new staticKeyword();
        System.out.println(++sk.i);

        staticKeyword sk1=new staticKeyword();
        System.out.println(sk1.i);

        System.out.println(++sk.si);
        System.out.println(sk1.si);
        System.out.println(staticKeyword.si);
        sk.a();
        staticKeyword.b();

        sample2 s2 = new sample2();
        System.out.println(s2.j);
        s2.c();
        System.out.println(sample2.ss);
        sample2.d();
    }
}

class sample2{
    int j = 2;
    static int ss = 4;

    public void c(){
        System.out.println("void c");
    }

    public static void d(){
        System.out.println("Static void d");
    }
}
/*
static is used with variables, methods & classes.
 */