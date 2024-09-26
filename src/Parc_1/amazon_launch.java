package Parc_1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_launch {
public void amazonlaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.driver.geckodriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
	WebDriver driver  = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		amazon_launch obj = new amazon_launch();
		obj.amazonlaunchAUT();

	}

}
