package Parc_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launching {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.driver.Chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		launching obj = new launching();
		obj.LaunchAUT();

	}

}
