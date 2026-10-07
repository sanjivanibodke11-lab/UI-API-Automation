package TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class reporting {
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeSuite
    public void setupReport(){
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\AutomationReport.html");
        reports = new ExtentReports();
        reports.attachReporter(sparkReporter);
    }

    @AfterMethod
    public void captureResult(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            test.log(Status.FAIL,result.getThrowable());
        } else if(result.getStatus() == ITestResult.SUCCESS){
            test.log(Status.PASS,result.getThrowable());
        }
        else{
            test.log(Status.SKIP,result.getThrowable());
        }
    }

    @AfterSuite
    public void close(){
        reports.flush();
    }
}
