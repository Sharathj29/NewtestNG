package Selenium;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowpopup 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=5vbf5rggn11b");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		WebElement choosefiles=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Actions act=new Actions(driver);
		
		if(choosefiles.isEnabled()) 
		{
			act.click(choosefiles).perform();
			Thread.sleep(2000);
		}
		
          Runtime.getRuntime().exec("./upload/upload1.exe");
          
          
	}

}
 