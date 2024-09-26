package Parc_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navihations {
WebDriver driver;
public void Launch() throws InterruptedException
{
	System.setProperty("webdriver.driver.Chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(2000);
	//driver.get("https://www.google.com/");
	//Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	}
public void scrnhot() throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\sneha kothapally\\OneDrive\\Desktop\\akhila java\\screensgort.png");
	FileHandler.copy(src, des);
}

	public static void main(String[] args) throws InterruptedException, IOException {
		navihations obj = new navihations();
		obj.Launch();
		obj.scrnhot();bv bv 
	}

}
