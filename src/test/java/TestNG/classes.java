package TestNG;

import org.testng.annotations.Test;

public class classes {

    @Test(groups = "Regression")
    public void a(){
        System.out.println("Void a");
    }

    @Test(groups={"Smoke","Sanity"})
    public void b(){
        System.out.println("Void b");
    }
}
