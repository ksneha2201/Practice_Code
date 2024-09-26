package Parc_1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
WebDriver driver;
public void LaunchUAT() throws InterruptedException
{
	System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	String AAA =driver.getTitle();
	System.out.println(AAA);
}
public void BBB()
{
	String exp="https://login.salesforce.com/";
	String expectedUrl = driver.getCurrentUrl();
	if(exp.equalsIgnoreCase(expectedUrl))
	{
		System.out.println("same");
	}
	else
	{
	System.out.println("not same");	
	}
}
	public static void main(String[] args) throws InterruptedException {
		practice obj = new practice();
		obj.LaunchUAT();
		obj.BBB();
		
	}

}
