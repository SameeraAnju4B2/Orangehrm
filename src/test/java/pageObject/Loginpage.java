package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage 
{
WebDriver driver;
public Loginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);	
}
	@FindBy(name="username")WebElement user;
	@FindBy(name="password")WebElement passw;
	@FindBy(xpath="//*[@type='submit']")WebElement button;
	public void username(String username)
	{
		user.sendKeys(username);
	}
	public void password(String password)
	{
		passw.sendKeys(password);
	}
	public void login()
	{
		button.click();
	}

	

}
