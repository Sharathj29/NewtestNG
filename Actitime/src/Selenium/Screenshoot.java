package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshoot  
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();		
		driver.get("http://127.0.0.1/login.do");
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		un.sendKeys("admin");
		//pwd.sendKeys("manager");
		//lgn.click();
		Thread.sleep(2000);
		File src=un.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Selenium//un.jpg");
		Files.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
