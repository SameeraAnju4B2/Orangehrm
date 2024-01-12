package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day38login {
 public WebDriver driver;
 public void Day38login(WebDriver driver)
{

	this.driver=driver;
	PageFactory.initElements(driver,this);	
}
	@FindBy(name="username")WebElement user;
	@FindBy(name="password")WebElement passwo;
	@FindBy(xpath="//*[@type='submit']")WebElement button;
	
	
	public void user()
	{
		user.sendKeys("Admin");
	}
	public void passw()
	{
		passwo.sendKeys("admin@123");
	}
	public void click()
	{
		button.click();
	}
	
	

}
