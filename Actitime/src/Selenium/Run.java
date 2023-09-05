package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Run 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver=new ChromeDriver();		
		driver.get("http://127.0.0.1/login.do;jsessionid=4079jo3gnivsn");	
		//WebElement un=driver.findElement(By.name("username"));
		//WebElement pwd=driver.findElement(By.name("pwd"));
		//WebElement lng=driver.findElement(By.name("Loginbutton"));
		//un.sendKeys("admin");
	//	pwd.sendKeys("manager");
	    // lng.click();
	     
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
	//	Thread.sleep(2000);
		List<WebElement> names=driver.findElements(By.xpath("//div[@class='label']"));
		//List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		
		
		 System.out.println(names.size());
		 
		 for(int i=0;i<=names.size()-1;i++) 
		 {
		
			
				System.out.println(names.get(i).getText());
		}
			
			
		 }
		
		
		
		
		
	     
	     
	     
		
		//driver.get("https://www.google.com/search?q=gmail.login&oq=gmail.login&aqs=chrome.0.69i59j0i512l9.5549j0j7&sourceid=chrome&ie=UTF-8");
		//driver.findElement(By.xpath("//h3[text()='Email - Gmail - Google']")).click();
		//driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sharath29495@gmail.com");
		//driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("8660021331");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.xpath("//span[text()='Next']/ancestor::button")).click();
		
		
	
	
	
	
	}
////div[@class="VfPpkd-RLmnJb"]
	




//driver.findElement(By.name("username")).sendKeys("admin");
//driver.findElement(By.name("pwd")).sendKeys("manager");
//driver.findElement(By.id("loginButton")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//td[@class='separator'][4]")).click();
