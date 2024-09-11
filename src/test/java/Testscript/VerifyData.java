package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.LoginDataProvider;
import BrowserConfiguration.Testsetup;
import ReusableComponents.BussinessComponents;

public class VerifyData extends BussinessComponents {
@Test(dataProvider="logindata",dataProviderClass=LoginDataProvider.class)
public void VerifyData(String username,String Password) throws IOException {
	String url=Testsetup.browser("url");
	LauchingBrowser(url);
	DataCredential(username,Password);
}
}
