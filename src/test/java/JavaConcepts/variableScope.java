package JavaConcepts;

import com.github.javafaker.Faker;

public class variableScope {
    int i=3; //instance variable

    static int s = 4; //static variable

    public static void main(String[] args) {
        int a=4; //local variable
        if(true){
            int j = 5; //local variable but local to if-block
            System.out.println(j);
        }
        System.out.println(a);
//        System.out.println(j);
        //<className> <objectName> = new <className>();
        variableScope vs = new variableScope();
        System.out.println(vs.i);
        System.out.println(++vs.i);

        variableScope vs2 = new variableScope();
        System.out.println(vs2.i);
        System.out.println(++vs.s);
        System.out.println(vs2.s);
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.superhero().name());
    }

}
/*
Instance Variable - Declared inside the class but not inside
a method/loop/condition
Can be accessed only with an object.

Local Variable - Declared inside a class and inside either a
method/loop/condition.
No Object is needed.

Static Variable - Declared just like an Instance variable but
with the keyword "static".
No Object is needed.
 */

/*
Class - India
Citizens - Objects
Static variable - Constitution of the Country
Instance Variable - Aadhaar Card
Local Variable - State Specific Laws/ Entrance Exams
 */