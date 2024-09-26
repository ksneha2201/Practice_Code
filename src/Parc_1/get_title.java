package Parc_1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title {
public void LaunchUAT() throws InterruptedException
{
	System.setProperty("WebDriver.Driver,Chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://login.salesforce.com/");
	Thread.sleep(1000);
	Driver.manage().window().maximize();
	String title = Driver.getTitle();
	System.out.println(title);
}

	public static void main(String[] args) throws InterruptedException {
		get_title obj = new get_title();
		obj.LaunchUAT();
	}
}
