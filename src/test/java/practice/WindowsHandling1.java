package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Google");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.linkText("Google Translate")).click();
		driver.findElement(By.linkText("Google Maps")).click();
		driver.findElement(By.linkText("Google Chrome")).click();
		driver.findElement(By.linkText("Google Play")).click();
		 Set<String>  alw  =driver.getWindowHandles();
		
		 for(String wl:alw)
		 {
			   String title=driver.switchTo().window(wl).getTitle();
			   if(title.equals("Google Maps - Wikipedia")|| title.equals("Google Play - Wikipedia"))
			   {
				   driver.close();
			   }
		 }
		 
		 Thread.sleep(3000);
		
		driver.quit();
		

	}

}
