package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
	//Select all Checkboxes.............................
	List<WebElement >  ex=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
  /*	 for(WebElement we:ex)
	 {
		we.click();
	 }
	*/
   // Select 1st 4 Checkbox..........................
	   for(int i=0;i<4;i++)
	   {
		   ex.get(i).click();
	   }
   // Select last 2 Checkbox..........................
	   //Starting index=total length-howmany numbers you want select...
	   for(int i=ex.size()-2;i<ex.size();i++)
	   {
		   ex.get(i).click();
	   }
	// if not selected only select it......................................  
	   Thread.sleep(3000);
	   for(WebElement e:ex)
	   {
		   if(!e.isSelected() )
			   e.click();
	   }
	  driver.close();
	   
	}

}
