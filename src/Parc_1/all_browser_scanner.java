package Parc_1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_browser_scanner {
	WebDriver driver ;
public void Launch() throws InterruptedException
{
	Scanner s = new Scanner(System.in);
	System.out.println("provide browser");
	String a = s.nextLine();
	if(a.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver = new ChromeDriver();
		
		}
	else if (a.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.driver.edgedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe\\");
		driver = new EdgeDriver();
		
	}
	else if(a.equalsIgnoreCase("Fire"))
	{
		System.setProperty("webdriver.driver.gickodriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		
	}
	else
	{
		System.out.println("browser not found");
	}
	Thread.sleep(3000);
	driver.get("https://login.salesforce.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("username")).sendKeys("sneha");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("sne@123");
	Thread.sleep(2000);
	driver.findElement(By.id("Login")).click();
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		all_browser_scanner obj = new all_browser_scanner();
		obj.Launch();

	}

}
