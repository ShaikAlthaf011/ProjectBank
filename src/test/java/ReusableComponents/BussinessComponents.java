package ReusableComponents;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import OrPage.Loginpage;

public class BussinessComponents extends TechnicalComponents {
public static Loginpage lp;
public static void LauchingBrowser(String url) {
	TechnicalComponents.Navigate(url);
	lp=new Loginpage(driver);
}
public void LoginCredential() {
	lp=new Loginpage(driver);
	lp.USERNAME(lp.Username,"142420");
	lp.PinNumber(lp.pin,"231225");
	lp.LoginButton(lp.Login);
}
public void DataCredential(String username,String Password) {
	lp=new Loginpage(driver);
	lp.USERNAME(lp.Username,username);
	lp.PinNumber(lp.pin,Password);
	lp.LoginButton(lp.Login);
}
public void Exceelsheet(String Username,String pinnumber) {
	lp=new Loginpage(driver);
	lp.USERNAME(lp.Username,Username);
	lp.PinNumber(lp.pin, pinnumber);
	lp.LoginButton(lp.Login);
}
}
