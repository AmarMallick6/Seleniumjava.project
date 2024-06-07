package pomdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage1 {
	// WITH OUT USING PAGE FACTORY...............
	WebDriver driver;
	 public LogInPage1(WebDriver d) {
	   	  driver=d;
	     }
      //Identify Locators..........
	By username=By.xpath("//input[@placeholder='Username']");
	By password= By.name("password");
	By Login=By.xpath("//input[@id='login-button']");
	//Methods for Locators.....................
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void logInMethod()
	{
		driver.findElement(Login).click();
	}
}
