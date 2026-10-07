package JavaConcepts;

public class methodOverloading {

    void a(){
        System.out.println("void a");
    }

    void a(int x){
        System.out.println(x);
    }

    void a(float x){
        System.out.println(x);
    }

    void a(int x, int y){
        System.out.println(x+y);
    }

    float a (int x, float y){
        return x+y;
    }

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.a();
        mo.a(1,1.2f);
        mo.a(1.3f);
    }
}


/*
A class containing multiple JavaConcepts.methods of the
same name but different parameters is called
as Method Overloading.

Method Overloading does not depend on
return types.
 */
