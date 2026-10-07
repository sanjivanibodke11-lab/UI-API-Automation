package TestNG;

import org.testng.annotations.Test;

public class groups {

    @Test(groups="Smoke")
    public void a(){
        System.out.println("Smoke Test case");
    }

    @Test(groups = "Sanity")
    public void b(){
        System.out.println("Sanity Test Case");
    }
}
