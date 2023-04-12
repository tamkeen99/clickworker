package com.clickwork.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override 
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		String r = result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File temp = t.getScreenshotAs(OutputType.FILE);
		File actu= new File("./ScreenShot/" +r+ ".png");
		try {
			FileUtils.copyFile(temp, actu);
		}
		 catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

	

	

}
