package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Day38baseclass {
    public WebDriver driver;
    Logger lg;
	@BeforeClass
	public void v1()
	{
		lg=LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@AfterClass
	public void v2()
	{
		//driver.close();
	}
}
 
