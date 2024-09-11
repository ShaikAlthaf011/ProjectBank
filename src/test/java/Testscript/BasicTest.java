package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest {
@Test(dataProvider="logindata",dataProviderClass=Data.class)
public void Openbrowser(String username,String password) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://qaebank.ccbp.tech/ebank/login");
	driver.manage().window().maximize();
	WebElement l1=driver.findElement(By.xpath("//input[@id='userIdInput']"));
	l1.sendKeys(username);
	WebElement l2=driver.findElement(By.xpath("//input[@id='pinInput']"));
	l2.sendKeys(password);
	WebElement l3=driver.findElement(By.xpath("//button[@class='login-button']"));
	l3.click();
	driver.quit();
}
}
