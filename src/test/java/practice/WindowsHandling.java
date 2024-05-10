package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		 Set<String>   windows    =   driver.getWindowHandles();
		 //Convert Set of String to List of String....................
		 ArrayList<String> Alwindow= new ArrayList<String>(windows);
		 String w1=Alwindow.get(0);
		 String w2=Alwindow.get(1);
		 driver.switchTo().window(w1);
		 driver.switchTo().window(w2);
		 driver.findElement(By.linkText("Company")).click();
		 driver.quit();
		
		 
		

	}

}
