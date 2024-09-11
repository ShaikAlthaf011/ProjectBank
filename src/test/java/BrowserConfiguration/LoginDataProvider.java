package BrowserConfiguration;

import org.testng.annotations.DataProvider;

public class LoginDataProvider  {
@DataProvider(name="logindata")
public Object[][]getlologindata(){
	return new Object[][] {
		{"142420","231225"},
		{"142421","231226"},
		{"142422","231227"},
		{"142423","231228"},
		{"142424","231229"}
	};
}
}
