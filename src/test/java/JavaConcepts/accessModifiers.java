package JavaConcepts;

public class accessModifiers {
    int x = 5;
    private int i = 2;

    public void smallMethod(){
        System.out.println("Small Method");
    }

    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        System.out.println(am.x);
        System.out.println(am.i);
        anotherClass ac = new anotherClass();
        System.out.println(ac.y);
//        System.out.println(ac.z);
        ac.a();
    }
}

class anotherClass{
    int y = 6;
    private int z = 5;

    public void a(){
        System.out.println("void a");
    }
}
/*
Access Modifiers: public, private, protected & default

Used along with Variables, Methods & Constructors.
 */