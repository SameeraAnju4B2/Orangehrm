package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.Loginpage;
import testBase.BaseClass;

public class Testcase extends BaseClass
{
 
 @Test
 public void testcase()
 {
	 Loginpage lp=new Loginpage(driver);
	 lp.username("Admin");
	 log.info("entered user name successfully");
	 lp.password("admin123");
	 log.info("entered password successfully");
	 lp.login();
	 if (driver.getTitle().equals("OrangeHRM"))
     {
	   log.info("test pass");
     }
	 else
	 {
		 log.info("test fail");
	 }
 }
	

 }
