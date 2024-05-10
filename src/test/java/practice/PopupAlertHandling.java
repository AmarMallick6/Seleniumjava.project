package practice;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //Accept the Alert...................
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();  //Cancel the Alert ..................
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert al= driver.switchTo().alert();
		String s=al.getText();    //Capture text from pop-up .................
		System.out.println(s);
		al.sendKeys("OK DONE");  //Send Text in Pop-up..................
		driver.close();
		al.accept();
		driver.close();

	}

}
