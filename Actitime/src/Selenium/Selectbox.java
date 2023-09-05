package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbox 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=28n8yox1sdtif");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("LoginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("Tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		WebElement customer=driver.findElement(By.name("selectedCustomer"));
		
		Select sel=new Select(customer);
		sel.selectByVisibleText("Swathi GS");
	    driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
	    
	    Alert alt=driver.switchTo().alert();
	    System.out.println(alt.getText());
	    Thread.sleep(2000);
	    Alert alt1=driver.switchTo().alert();
	    alt1.accept();
	    
	} 

}
