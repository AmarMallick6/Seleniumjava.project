package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaleElementExceptionHandle

 {

	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http:/primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			String linkname = links.get(i).getText();
			links.get(i).click();
			String linkurl = driver.getCurrentUrl();
			System.out.println(linkname+"    "+linkurl);
			driver.navigate().back();
			
			links = driver.findElements(By.tagName("a"));
		}
		driver.close();

	}

}
			
			
		
			
		

