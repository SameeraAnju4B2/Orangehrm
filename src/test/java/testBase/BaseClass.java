package testBase;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass
{
 public WebDriver driver;
  public Logger log;
   @BeforeClass
   @Parameters({"browser"})
   
   public void v1(String browser){
	   
	   if(browser.equals("Chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browser.equals("Edge"))
	   {
		  driver=new EdgeDriver(); 
	   }
	   else
	   {
		   driver=new ChromeDriver();
	   }
	   log=LogManager.getLogger(this.getClass());
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
@AfterClass
public void v2()
{
	driver.close();
}
public void screenshot()
{
	TakesScreenshot ts=(TakesScreenshot)driver;
}



}








