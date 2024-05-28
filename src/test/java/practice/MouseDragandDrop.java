package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
		 WebElement Src1 = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		 WebElement target1 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		 act.dragAndDrop(Src1, target1).perform();
		 WebElement Src2 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		 WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		 act.dragAndDrop(Src2, target2).perform();
		
		 driver.close();
		
	}

}
