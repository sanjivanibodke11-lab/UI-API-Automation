package JavaConcepts;

interface inf{
    public static final int i = 5;
    /*
    All interface variables are public static final by definition
     */
    public abstract void a();
    /*
    All interface methods are public abstract by definition
     */
}

interface bcde{
    int x = 5;
}

public class interfaceConcept implements inf, bcde{
    public void a(){
        System.out.println("Void a");
    }

    public static void main(String[] args) {
//        inf in = new inf();
        /*
        interfaces cannot be instantiated
         */
        interfaceConcept ic = new interfaceConcept();
        ic.a();
        System.out.println(inf.i);
    }
}

/*
class extends class
interface extends interface
class implements interface
 */