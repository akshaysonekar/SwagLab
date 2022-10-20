package test;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;
import pojo.Browser1;
import pom.FacebookLoginPage;
@Listeners//(utility.Listeners.class)
public class FacebookLoginTest {
	WebDriver driver;
	@BeforeMethod
	public void chrome() {
		driver=Browser1.openChromeBrowser();
	}
	
	
	@Test
	public void LoginWithCredentials(String a,String b)  {
		
		FacebookLoginPage faceBookLoginPage=new FacebookLoginPage(driver);
		faceBookLoginPage.enterEmail(a);
		faceBookLoginPage.enterPassword(b);
		faceBookLoginPage.clickOnLogin();
		
		
	}
	@Test
	public void LoginWihoutPassword(String a) throws InterruptedException {
		
		FacebookLoginPage faceBookLoginPage=new FacebookLoginPage(driver);
		faceBookLoginPage.enterEmail(a);
		faceBookLoginPage.clickOnLogin();
	
	}@Test
	public void LoginWithoutEmail() throws InterruptedException {
		
		FacebookLoginPage faceBookLoginPage=new FacebookLoginPage(driver);
		faceBookLoginPage.enterPassword("12345");
		faceBookLoginPage.clickOnLogin();
		Thread.sleep(3000);
	}

}
