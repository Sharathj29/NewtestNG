package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		String mm="Sep";
		String dd="12";
		String yy="2023";
		int i=1;
		while(i<=12) 
		{ 
		 try
		 { 
			 driver.findElement(By.xpath("//div[contains(@aria-label,' "+mm+" "+dd+" "+yy+"')]")).click();
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				break;
		 }
			catch (Throwable t)
		 {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			//Thread.sleep(2000);
		 }
			
		}

	}

}
