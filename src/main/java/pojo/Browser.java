package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://kite.zerodha.com");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	return driver;
	}
}
