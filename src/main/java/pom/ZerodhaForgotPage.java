package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	@FindBy(xpath="//label[@class='su-radio-label']")private WebElement rememberUserId;
	@FindBy(xpath="(//label[@class='su-radio-label'])[2]")private WebElement forgotUserId;
    @FindBy(xpath="//input[@placeholder='User ID']")private WebElement userId;
    @FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
    @FindBy(xpath="(//label[@class='su-radio-label'])[4]")private WebElement sms;
    
    public ZerodhaForgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
    }
    public void clickOnRememberUserId() {
    	rememberUserId.click();
    }
    public void clickonForgotUserId() {
    	forgotUserId.click();
    }
    public void enterUserId(String user) {
    	userId.sendKeys(user);
    }
    public void enterPan(String Pan) {
    	pan.sendKeys(Pan);
    }
    public void clickOnSms() throws InterruptedException {
    	sms.click();
    	Thread.sleep(3000);
    }
    
}
