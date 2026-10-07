package Cucumber.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {

    @Given("the user opens the application")
    public void openApp(){
        System.out.println("user opens the app");
    }

    @When("the user enters the credentials")
    public void enterCreds(){
        System.out.println("the user enters the credentials");
    }

    @And("the user clicks on login")
    public void loginClick(){
        System.out.println("the user clicks on login");
    }

    @Then("the user must be able to login")
    public void loginVerify(){
        System.out.println("the user must be able to login");
    }

    @When("the user enters incorrect credentials")
    public void enterIncorrectCreds(){
        System.out.println("the user enters incorrect credentials");
    }

    @Then("the user must not be able to login")
    public void cantLogin(){
        System.out.println("the user must not be able to login");
    }

    @Before
    public void beforeHook(){
        System.out.println("Before Hook");
    }

    @After
    public void afterHook(){
        System.out.println("After Hook");
    }

    @And("the user enters the username as {string}")
    public void enterUsername(String s){
        System.out.println("Username: "+s);
    }

    @And("the user enters the password as {string}")
    public void enterPass(String s){
        System.out.println("Password: "+s);
    }
}
