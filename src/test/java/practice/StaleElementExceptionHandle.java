package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		 List<WebElement>    Allinks=  driver.findElements(By.tagName("a"));
		 int l=Allinks.size();
		 System.out.println(l);
		 for(int i=0;i<l;i++)
		 {
			 String lname=Allinks.get(i).getText();
			 try {
				 Allinks.get(i).click();
				 String curl=driver.getCurrentUrl();
				 System.out.println("LinkName : "+  lname+"        "+ "LinkUrl: "+ curl);
				 driver.navigate().back();
				// Thread.sleep(2000);
				 Allinks=    driver.findElements(By.tagName("a"));
			 }
			 catch (StaleElementReferenceException e) {
	                // Element is stale, refresh the list and continue
	                Allinks = driver.findElements(By.tagName("a"));
	                continue;
	            }
			 
			
			 
		 }
		 driver.close();
		

	}

}
