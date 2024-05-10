package practice;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://visionias.in/");
		//Capture Screenshot  of  full webpage............................................
		TakesScreenshot ts= (TakesScreenshot)driver;  //typecasting Webdriver interfacce to Takescreenshot interface
		File src= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(".//Screenshots//Fullpage.png") ;
		FileUtils.copyFile(src, target);
		
		
		//Capture Screenshot Specific area of webpage.............
	    WebElement we= driver.findElement(By.xpath("//div[@id='Mobile_app_banner']//div//img"));
	  
	    File srf=we.getScreenshotAs(OutputType.FILE);
	    File trgt= new File(".//Screenshots//Someportions.png");
	    FileUtils.copyFile(srf, trgt);
	  //Capture Screenshot Specific elements of webpage.............
	    WebElement ele= driver.findElement(By.xpath("//ul[@class='dropdown menu']//li//span//img"));
	    File sr=ele.getScreenshotAs(OutputType.FILE);
	    File tr= new File(".//Screenshots//element.png");
	    FileUtils.copyFile(sr, tr);
        driver.close();
	}

}
