package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Parameterization;
@Listeners(utility.Listeners.class)
public class ZerodhaLoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
	   driver=Browser.openChromeBrowser();
	}
	@Test
	public void validateZerodhaLogin() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage =new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterUserID(Parameterization.getExceldata(0, 1, "Credentials"));
		zerodhaLoginPage.enterPassword(Parameterization.getExceldata(1, 1, "Credentials"));
		zerodhaLoginPage.clickOnLogin();
		zerodhaLoginPage.clickOnForgot();
		zerodhaLoginPage.clickOnSignUp();
		
		
	}

}
