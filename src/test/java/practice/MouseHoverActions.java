package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.Ajio.com");
		WebElement mainmenu = driver.findElement(By.xpath("//span[@aria-label='MEN']"));
		WebElement submenu = driver.findElement(By.xpath("//div[@class='column column-2']//a[@title='T-shirts'][normalize-space()='T-shirts']"));
		Actions act=new Actions(driver);
		 act.moveToElement(mainmenu).moveToElement(submenu).click().perform();
		if( driver.findElement(By.xpath("//div[@aria-label='Tshirts']")).isDisplayed())
		{
			System.out.println("Sucessfully Excuted code");
		}else {System.out.println("Sucessfully Not Excuted code");}
		 
		driver.close();
		
		
		
		
		

	}

}
