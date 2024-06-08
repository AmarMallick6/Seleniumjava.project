package pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInpagewithPageFactory {
	WebDriver driver;
	LogInpagewithPageFactory (WebDriver d)
	{ 
		driver=d;
		PageFactory.initElements(driver,this);
	}	
	
  @FindBy(id="user-name") WebElement username;
  @FindBy(id="password") WebElement password;
  @FindBy(id="login-button") WebElement Login;
  public void enterUserName(String user)
  {
	 username.sendKeys(user); 
  }
  public void enterPassword(String pwd)
  {
	  password.sendKeys(pwd);
  } 
  public void clickLogin()
  {
	  Login.click();
  }
  
}
