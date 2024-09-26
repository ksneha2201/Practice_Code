package Parc_1;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_times {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter expected times");
    int count = s.nextInt();
	for(int i=1; i<=count; i++)
	{
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
}
	public static void main(String[] args) throws InterruptedException {
		multiple_times obj = new multiple_times();
		obj.LaunchAUT();
		

	}

}
