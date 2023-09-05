package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropBy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
		driver.manage().window().maximize();
				
		WebElement src=driver.findElement(By.xpath("//div[@class='dg-movable']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
	    act.dragAndDropBy(src, 100, 250).perform();

	}

}
