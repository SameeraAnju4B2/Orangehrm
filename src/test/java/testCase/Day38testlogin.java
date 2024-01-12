package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.Day38login;
import testBase.Day38baseclass;

public class Day38testlogin extends Day38baseclass
{ 
	//public WebDriver driver;
	@Test
	public void karti(WebDriver driver)
	{
		Day38login vv=new Day38login(driver);
		vv.user();
		vv.passw();
		vv.click();
	}
	

}
