package Parc_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_browser_array {
	WebDriver driver ;
public void launch() throws InterruptedException
{
	String[] browser= {"Chrome","edge","firefox"};
	for(String bro:browser)
	{
		if (bro.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.driver.chrome", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
			driver = new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}
		else if(bro.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.driver.gicko", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();	
		}
		else if(bro.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.driver.edge","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe\\");
			driver = new EdgeDriver();
			Thread.sleep(2000);
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();	
		}
		driver.findElement(By.id("username")).sendKeys("sneha@");
		driver.findElement(By.id("password")).sendKeys("sne@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		driver.close();
	}
}
	public static void main(String[] args) throws InterruptedException {
		all_browser_array obj = new all_browser_array();
		obj.launch();

	}

}
