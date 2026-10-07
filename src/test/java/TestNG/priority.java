package TestNG;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = -1)
    public void a(){
        System.out.println("Void a");
    }

    @Test
    public void c(){
        System.out.println("Void c");
    }

    @Test
    public void d(){
        System.out.println("Void d");
    }

    @Test(priority = 2)
    public void e(){
        System.out.println("Void e");
    }

    @Test(priority=5)
    public void b(){
        System.out.println("Void b");
    }

    @Test(priority = 1)
    public void f(){
        System.out.println("Void f");
    }

    @Test(priority =3)
    public void g(){
        System.out.println("Void g");
    }
}
