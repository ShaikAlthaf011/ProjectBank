package OrPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents {

	@FindBy(xpath="//input[@id='userIdInput']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@id='pinInput']")
	public WebElement pin;
	
	@FindBy(xpath="//button[@class='login-button']")
	public WebElement Login;
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    public void USERNAME(WebElement element,String Text) {
    	TechnicalComponents.sendkeys(element,Text);
    }
    public void PinNumber(WebElement element,String Text) {
    	TechnicalComponents.sendkeys(element, Text);
    }
    public void LoginButton(WebElement element) {
    	TechnicalComponents.Click(element);
    }
}
