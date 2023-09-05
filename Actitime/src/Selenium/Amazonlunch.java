package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Amazonlunch {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException 
	{
		    WebDriver driver=new ChromeDriver();   //Amazon lunch page
		    driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1TfITc9OV2A0YHRg8GJLzE2sys8DAELoBhw&q=amazon&oq=am&aqs=chrome.1.69i57j46i131i199i433i465i512j0i131i433i512l3j46i199i465i512j69i60l2.3023j0j7&sourceid=chrome&ie=UTF-8");
		    driver.manage().window().maximize();
		    
			driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb ob9lvb']")).click();
			
			Actions act=new Actions(driver);
			WebElement Hello_sign_in=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
			act.moveToElement(Hello_sign_in).perform();
		
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.name("email")).sendKeys("8660021331");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.name("password")).sendKeys("7406694286");
			driver.findElement(By.name("rememberMe")).click();
			driver.findElement(By.id("signInSubmit")).click();
			
			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14 pro max 256gb deep purple");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
			
			//driver.findElement(By.xpath("(//a[@class='_apple-brand-showcase_showcase_showcase-link__3QpvX qa-link'])[1]")).click();
			
			Set<String> s=driver.getWindowHandles();
			Iterator<String> it=s.iterator();
			String parent=it.next();
		    String child=it.next();
			System.out.println(parent);
			System.out.println(child);			
			driver.switchTo().window(child);
			driver.findElement(By.name("submit.add-to-cart")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("attach-close_sideSheet-link")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']")).click();
			Thread.sleep(2000);
			
			List<WebElement> names=driver.findElements(By.xpath("//span[@class='a-truncate-cut']"));
			 
			System.out.println(names.size());
			 
			for(int i=0;i<=names.size()-1;i++) 
			{
				System.out.println(names.get(i).getText());
			}
			
			List<WebElement> names1=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
			 
			System.out.println(names1.size());
			 
			for(int i=0;i<=names1.size()-1;i++) 
			{
				System.out.println(names1.get(i).getText());
			
			}
			driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		
			//Actions act1=new Actions(driver);
			//WebElement Hello_Sharath=driver.findElement(By.id("nav-link-accountList"));
			//act1.moveToElement(Hello_Sharath).perform();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
			
			
			
			
			
			
			//driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute nav-active']")).click();
			
			
			//driver.findElement(By.xpath("(//a[@class='_apple-brand-showcase_showcase_showcase-link__3QpvX qa-link'])[1]")).click();
			
		//	driver.findElement(By.linkText("Add to Cart")).click();	
			
			
			
			//Actions act1=new Actions(driver);
			//WebElement Hello_Sharath=driver.findElement(By.id("nav-link-accountList"));
			//act1.moveToElement(Hello_Sharath).perform();
			
			//Robot rbt=new Robot();
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
		   // rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
	    	//rbt.keyPress(KeyEvent.VK_DOWN);
		//	Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
		//	Thread.sleep(2000);
		  //  rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(2000);
			//rbt.keyPress(KeyEvent.VK_DOWN);
			//Thread.sleep(3000);
			//rbt.keyPress(KeyEvent.VK_ENTER);
			
			
			
				
		   // WebElement un=driver.findElement(By.xpath("//a[@class='nav-imageHref']"));
		   // File src=un.getScreenshotAs(OutputType.FILE);
		    //File dest=new File("D:\\Selenium//Amazon");
		  //  Files.copy(src, dest);
			
			
				
			
			//driver.manage().window().maximize();
			//driver.manage().window().minimize();
			//driver.navigate().back();
			//driver.navigate().forward();
			//driver.navigate().refresh();
			

	}

}
