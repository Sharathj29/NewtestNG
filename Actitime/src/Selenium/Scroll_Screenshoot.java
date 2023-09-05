package Selenium;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Scroll_Screenshoot 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://notepad-plus-plus.org/downloads/v8.5.6/");
		AShot screenshot=new AShot();
		Screenshot sh=screenshot.shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
		ImageIO.write(sh.getImage(), "jpg", new File("D:\\Selenium\\times.jpg"));
	
		

	}

}
