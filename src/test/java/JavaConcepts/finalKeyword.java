package JavaConcepts;

final class bcd{
    int s = 4;
}

class abc{
    public void a(){
        System.out.println("Void a");
    }

    public final void b(){
        System.out.println("Void b");
    }
}

public class finalKeyword extends abc{
    int i =6;
    final int j = 3;

    public void a(){
        System.out.println("Overriding");
    }

//    public void b(){}

    public static void main(String[] args) {
        finalKeyword fk = new finalKeyword();
        System.out.println(++fk.i);
//        System.out.println(++fk.j);
    }
}

/*
A final variable becomes a constant
A final method cannot be overridden
A final class cannot be inherited
 */