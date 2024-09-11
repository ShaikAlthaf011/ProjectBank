package ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import BrowserConfiguration.Testsetup;

public class TechnicalComponents extends Testsetup {
public static void Navigate(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
}
public static void Click(WebElement element) {
	element.click();
}
public static void sendkeys(WebElement element,String Text) {
	element.sendKeys(Text);
}


}
