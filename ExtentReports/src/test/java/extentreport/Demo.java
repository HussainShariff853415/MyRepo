package extentreport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Demo {


	static ExtentReports extent = new ExtentReports();
	public static ExtentTest reporting()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/Akram.html");
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Adding customers");
		return logger;
	}
	
	
	
	
	
	@Test
	public void imTest() throws IOException
	{
		
//		if(wbelement.isdiplapyed)
//		{
//			reporting().log(Status.PASS, "title displayed");
//			extent.flush();	
//		}
	
		reporting().log(Status.PASS, "title displayed");
		extent.flush();	
		
//		if(var == true)
//		{
//			reporting().log(Status.PASS, "title displayed");
//			extent.flush();	
//		}
//		else
//		{
//			reporting().log(Status.FAIL, "title not displayed");
//			extent.flush();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(var == true) {
//		
//			logger.log(Status.PASS, "title displayed");
//		}
//		else
//		{
//			logger.log(Status.FAIL, "title not displayed");
//		}
		
		
	
		
		
//		if(0>5)
//		{
//			logger.log(Status.PASS, "Satisfied the condition");
//		}
//		
//		else
//		{
//			logger.log(Status.FAIL, "Not Satisfied the condition");
//		}
		
//		
//		
//		try {
//			int c = 10/0;
//		} catch (Exception e) {
//			logger.log(Status.FAIL, "Exception is" + e);
//		}
		
		
		
		
		
		//logger.addScreenCaptureFromPath("F:\\screen\\newpic");
		
		
		
		
		
//		ExtentReports reports = new ExtentReports("Path of directory to store the resultant HTML file", true);
//
//		ExtentTest test = reports.startTest("TestName");
		
		
		
		
	}
	
	

}
