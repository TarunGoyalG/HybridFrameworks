package UTILITIES;


import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PAGEOBJECTTT.BaseClass;


public class Mylisteners  implements ITestListener {
public ExtentSparkReporter html;
public ExtentReports report;
public ExtentTest test;

//@BeforeTest
public void startReport() {
//	String time=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//String rep="Test-Report-"+time+".html";
//html=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/"+rep);
//html.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");

}


public void onTestStart(ITestResult result) {
//	test=report.createTest(result.getName());
//	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));

}

public void onTestSuccess(ITestResult result) {
	test=report.createTest(result.getName());
	test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
}


public void onTestFailure(ITestResult result) {
	test=report.createTest(result.getClass().getName());
	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
test.log(Status.INFO,result.getThrowable().getMessage());
	//String path=System.getProperty("user.dir")+"\\Sceenshot\\"+result.getName()+".png";
//File f=new File(path);
	//test.fail((Markup) test.addScreenCaptureFromPath(path)
//if(f.exists()) {
try {
//getscreenshot( driver,result.getName());
	
String mt=	new BaseClass().capture(result.getName());
test.addScreenCaptureFromPath(mt);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}




public void onTestSkipped(ITestResult result) {
	test=report.createTest(result.getName());
	test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
}


public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}

public void onTestFailedWithTimeout(ITestResult result) {
	
}

public void onStart(ITestContext context) {

	html=new ExtentSparkReporter("index.html");
report=new ExtentReports();

report.attachReporter(html);
report.setSystemInfo("Host name","localhost");
report.setSystemInfo("Environment","QA");
report.setSystemInfo("user","Pavan");

html.config().setDocumentTitle("InternetBanking Project");
html.config().setReportName("Functional Test Start");
html.config().setTheme(Theme.DARK);
html.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')'");


}

@Override
public void onFinish(ITestContext context) {
	report.flush();
}

//@Test
//public void launchBrowser() {
//	test=report.createTest("Launch Browser");
//	Assert.assertTrue(true);
//}
//
//@Test
//public void verifytitle() {
//	test=report.createTest("verify title");
//	Assert.assertTrue(false);
//}
	 
}
