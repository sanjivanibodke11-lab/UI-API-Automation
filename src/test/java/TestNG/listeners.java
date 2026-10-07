package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test Case execution has started: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Case execution is successful: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test Case execution has failed: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test Case execution has skipped: "+result.getName());
    }
}
