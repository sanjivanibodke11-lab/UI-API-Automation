package JavaConcepts;

abstract class abClass{
    public abstract void a(); //abstract method

    public void b(){ //concrete method
        System.out.println("Void b");
    }
}

public class abstractionConcept extends abClass {
    /*
    Abstract Class contains abstract methods & concrete methods

    Abstract Method: Method without any method body.
    Concrete Method: Method with a body.
     */

    public void a(){
        System.out.println("Overriding method");
    }

    public static void main(String[] args) {
        /*
        abstract classes cannot be instantiated
         */
        abstractionConcept ac = new abstractionConcept();
        ac.a();
        ac.b();
        abClass ab = new abstractionConcept();
    }
}
