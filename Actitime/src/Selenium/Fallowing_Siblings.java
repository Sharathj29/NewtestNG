package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fallowing_Siblings 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/user/submit_tt.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Tasks")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//td[text()='Swathi GS']/following-sibling::td[6]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='listtblcell selectCell']/preceding-sibling::td[2])[1]]")).click();

	}

}
