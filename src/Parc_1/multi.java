package Parc_1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi {
	WebDriver driver;
public void mul()
{
	Scanner a = new Scanner(System.in);
	System.out.println("enter expected times");
	int count = a.nextInt();
	for (int i=1; i<=count; i++)
	{
		System.setProperty("webdriver.driver.Chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.close();
	}
	
}
	public static void main(String[] args) {
		multi obj = new multi();
		obj.mul();

	}

}
