package JavaConcepts;

public class dataTypes {
    public static void main(String[] args) {
        /*
        Primitive: Integers, Decimals, Characters & Boolean.

        Non-Primitive: Arrays, String, Class, Interface

        Primitive:
        byte - Size is 2 power 8.
        -128 to -1 & 0 to 127.

        short: Size is 2 power 16.
        -32768 to -1 & 0 to 32767

        int: Size is 2 power 32.

        long: Size is 2 power 64.

        Decimals:
        float: Size is 2 power 32.
        double : Size is 2 power 64.

        Boolean:
        boolean: value is true or false.

        Character:
        char: Size is 2 power 16.
        It is denoted in Single Quote & Single letter.
         */
//        x=x+5;

        //<dataType> <variableName> = <value>;
        int x;  //Declaration
        x=5; //initialisation
        x=6; //update
        byte b = -128;
        b = 0;
        short s = 3276;
        int i = 25;
        long l = 2352346;
        float a = 1.234f;
        double bb = 6.3462346;
        boolean bool = true;
        char ch = 'a';
        char ch1 = '9';
        char ch2 = ',';
        char ch3 = 65;
        char ch4 = 'ఆ';

//        System.out.println(1+bool);
        System.out.println(x+b);
        System.out.println('x'+'b');
        System.out.println('x'+b);
    }
}
