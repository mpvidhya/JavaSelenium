package extentreport;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CreateReport
{

    /*
     *  7 Level
     *  	Pass
     *  	Fail
     *  	Skip
     *  	Warning
     *  	Info
     *  	Fatal
     *  	Error
     *
     */

    @Test
    public void testReport() throws IOException
    {
        ExtentSparkReporter reporter=new ExtentSparkReporter("AutomationReport1.html");
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setDocumentTitle("Automation Report");
        reporter.config().setReportName("Sprint1");


        ExtentReports extent=new ExtentReports();


        extent.attachReporter(reporter);

        ExtentTest test01=extent.createTest("TC1","Login");


        test01.

        test01.pass("Test Passed- Able to login");


        ExtentTest test02=extent.createTest("TC2","Payment");
        test02.info("Card details valid");
        test02.pass("Payment done");



        ExtentTest test03=extent.createTest("TC3","Logout");

//        test03.fail("Logout",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\USER\\Desktop\\OA Docs\\Aamir2.jpg").build());
//
//        test03.addScreenCaptureFromPath("C:\\Users\\USER\\Desktop\\OA Docs\\Aamir.jpg");

        test03.fail( "Logout failed");
        test03.log(Status.FAIL, "Logout failed");
        test03.fail("Logout",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\USER\\Desktop\\OA Docs\\Aamir2.jpg").build());

        extent.flush();


    }

}