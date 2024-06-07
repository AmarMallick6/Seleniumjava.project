package pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com");
		LogInPage1 lp = new LogInPage1(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.logInMethod();
		
		

	}

}
