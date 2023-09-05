package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RUN6 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q=facebook&oq=&aqs=chrome.0.35i39i362l8.271726361j0j15&sourceid=chrome&ie=UTF-8");
	driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']")).click();
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("sharath29495@gmail.com");
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("Jayabharathi@123");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	//driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
	
	
	}

}

