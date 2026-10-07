package JavaConcepts;

class parent{
    int i = 2;

    public void a(){
        System.out.println("Void a");
    }
}

public class inheritance1 extends parent {
    int j = 3;

    public void a(){
        System.out.println("Method Overriding");
    }

    public void b(){
        super.a(); //super behaves like parent class object
    }

    public static void main(String[] args) {
//        parent p = new parent();
//        System.out.println(p.i);

        inheritance1 i1 = new inheritance1();
        System.out.println(i1.j);
        System.out.println(i1.i);
        i1.a();
        i1.b();
    }
}
