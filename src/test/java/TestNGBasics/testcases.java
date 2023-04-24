package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases {
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Lanching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
	@Test(priority=1)
	public void doReg() {
		System.out.println("Registering a user");
	}
	
	@Test(priority=2)
	public void doLogin() {
		System.out.println("User Login");
		String expectedUserName = "Bos1";
		String actualUserName = "Bos17";
		Assert.assertEquals(expectedUserName, actualUserName);
	}

}
