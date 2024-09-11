package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.Testsetup;
import ReusableComponents.BussinessComponents;
import ReusableComponents.DataProviders;
public class VerifyExceelsheetData extends BussinessComponents {
@Test(dataProvider="getdata",dataProviderClass=DataProviders.class)
public void VerifyExceelsheetData(String Username,String pinnumber) throws IOException {
	String url=Testsetup.browser("url");
	LauchingBrowser(url);
	Exceelsheet(Username.trim(),pinnumber.trim());
}
}

