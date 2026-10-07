package JavaConcepts;

public class operators {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        float e = 2f;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(d-c));
        System.out.println("Multiplication: "+(a*c));
        System.out.println("Divide: "+(c/b));
        System.out.println(c/e);

        /*
        a=a+1 or a+=1 or a++ or ++a - increase by 1
        a=a+2 or a+=2

        a=a-1 or a-=1 or a-- or --a - decrease by 1
        a=a-2 or a-=2

        a = a*2 or a*=2

        a=a/2 or a/=2
         */

//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(++a+b+c+d);
//        System.out.println(a+++b+c+d);
        System.out.println(6%4);
        /*
        Relational Operators
        >,<,>=,<=,!=,==

        '=' - Assignment Operator
        '==' - Equality Operator
         */

        /*
        Logical Operator
        &&, ||  - And Or Truth Tables
         */
        System.out.println("And: "+(((a+b)>0)&&((c+d)>0)));
        System.out.println("Or: "+(((a+b)>0)||((c+d)<0)));
    }

}
