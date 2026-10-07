package JavaConcepts;

public class constructorsConcept {
    int x;
    public constructorsConcept(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        constructorsConcept cc = new constructorsConcept();
    }
}

/*
A constructor is a piece of code which
executes when an object is created

A constructor's name is same as the class
in which it is created.

A constructor looks like a method but
does not have a return type or void.
 */