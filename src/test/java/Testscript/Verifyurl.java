package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.Testsetup;
import ReusableComponents.BussinessComponents;

public class Verifyurl extends BussinessComponents{
@Test
public void Verifyurl() throws IOException {
	String url=Testsetup.browser("url");
	LauchingBrowser(url);
	LoginCredential();
}




}
