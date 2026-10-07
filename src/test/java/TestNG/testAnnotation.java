package TestNG;

import org.testng.annotations.Test;

public class testAnnotation {

    @Test(description = "Sample Description")
    public void a(){
        System.out.println("Void a");
    }

    @Test(timeOut = 5000)
    public void b() throws Exception{
        Thread.sleep(5500);
        System.out.println("Void b");
    }

    @Test(enabled = false)
    public void c(){
        System.out.println("Void c");
    }

    @Test(invocationCount = 5)
    public void d(){
        System.out.println("Void d");
    }

    @Test(dependsOnMethods = "b")
    public void e(){
        System.out.println("Void e");
    }
}
