package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	@FindBy(xpath="//input[@id='userid']")private WebElement userId;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;

	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserID(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String Pass) {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(Pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	
}
