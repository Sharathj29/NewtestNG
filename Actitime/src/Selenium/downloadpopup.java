package Selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class downloadpopup
{

	public static void main(String[] args) 
	{
	HashMap<String, Object>	m=new HashMap<String, Object>();
	m.put("profile.default_content_settings.pop", 0); //insted of 1 give 2 it will download in folder
	m.put("download.default_directory", "D:\\popup");
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("useAutomationExtension", false);
	options.setExperimentalOption("prefs", m);
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://notepad-plus-plus.org/downloads/v8.5.6/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@src='/downloads/images/folder_download_4.png']")).click();
		
	
	
	}

}
