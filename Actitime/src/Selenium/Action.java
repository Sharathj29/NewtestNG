package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action
{
	
	//public static void Key_down(int i) throws AWTException, InterruptedException
	//{
		// Robot rbt=new Robot();
		// int x =1;
		// while (x<=i)
		 //{
		//	 rbt.keyPress(KeyEvent.VK_DOWN);
			// Thread.sleep(2000);
			// x++;
		 //}
	//}

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//WebDriver driver=new ChromeDriver();		
		//driver.get("https://paytm.com/");
		//Actions act=new Actions(driver);
		//WebElement paytm_business=driver.findElement(By.linkText("Paytm For Business"));
		//WebElement Consumer_Payments=driver.findElement(By.linkText("Consumer Payments"));
		//WebElement Online_Payments=driver.findElement(By.linkText("Online Payments"));
		//WebElement payment_gateway=driver.findElement(By.linkText("Payments gateway"));
		//act.moveToElement(paytm_business).perform();
		//act.moveToElement(Consumer_Payments).perform();
		//act.moveToElement(Online_Payments).perform();
	//act.moveToElement(payment_gateway).click(payment_gateway).perform();
		
		
		WebDriver driver=new ChromeDriver();		
	   driver.get("http://127.0.0.1/login.do;jsessionid=2oqch4iyivmvq");
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();
	   Thread.sleep(2000);
	   
	   Actions act=new Actions(driver);
	 WebElement Users=driver.findElement(By.linkText("Users"));  //Action of Class
	  act.moveToElement(Users).perform();
	  // act.doubleClick(Users).perform();
	   act.contextClick(Users).perform();  
	   
	   
	   Robot rbt = new Robot();                                    //double click and right click
	    rbt.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(2000);
	   rbt.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(2000);
	   rbt.keyPress(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
	   
	   Set<String> s=driver.getWindowHandles();
	   Iterator<String> it=s.iterator();
	   String parent=it.next();
	   String child=it.next();
	   System.out.println(parent);
	   System.out.println(child);
	   driver.switchTo().window(child);
	   driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	    
		

	}

}
