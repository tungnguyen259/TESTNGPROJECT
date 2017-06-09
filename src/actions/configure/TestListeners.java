package actions.configure;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import actions.common.CommonActions;

public class TestListeners implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Execution onFinish");
	}

	@Override
	public void onStart(ITestContext arg0) {
		CommonActions.getCommonObject().getAutomationCofiguration();
		System.out.println("Execution onstart");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
	    //Object currentClass = arg0.getInstance();
        //WebDriver driver = ((BaseTest) currentClass).getDriver();
		CommonActions.getCommonObject().takeScreenShot("fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Execution onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Execution onTestSuccess");
		
	}
	
}
