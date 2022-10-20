package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotPage;
import pom.ZerodhaLoginPage;
import test.ZerodhaLoginTest;
import utility.Parameterization;
@Listeners(utility.Listeners.class)
public class ZerodhaForgotTest {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.openChromeBrowser();
	}

	@Test
	public void validateZerodhaForgot() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parameterization.getExceldata(0, 1, "Credentials"));
		zerodhaLoginPage.enterPassword(Parameterization.getExceldata(1, 1, "Credentials"));
		zerodhaLoginPage.clickOnLogin();
		
		ZerodhaForgotPage zerodhaForgotPage= new ZerodhaForgotPage(driver);
		
		zerodhaForgotPage.clickOnRememberUserId();
		zerodhaForgotPage.enterUserId(Parameterization.getExceldata(0, 1, "Credentials"));
		zerodhaForgotPage.enterPan(Parameterization.getExceldata(3, 1,"Credentials"));
		zerodhaForgotPage.clickOnSms();
		zerodhaForgotPage.clickonForgotUserId();
		
	}

}
