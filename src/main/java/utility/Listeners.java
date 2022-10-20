package utility;

import java.io.IOException;
import utility.ScreenShot;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;
import utility.ScreenShot;
public class Listeners extends PageElements implements ITestListener  {
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successful "+result.getName());
		try {
			ScreenShot.takeScreenShot(driver,result.getName());
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	public void onTestFailure(ITestResult result) {
		try {
		ScreenShot.takeScreenShot(driver,result.getName());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped"+result.getName());
		
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Started"+result.getName());
	}
	

}
