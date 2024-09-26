package Parc_1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practi {
	WebDriver driver;
	public void launch() throws InterruptedException
	{
System.setProperty("webdriver.driver.chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
driver = new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
String AAA = driver.getTitle();
System.out.println("AAA");

	}	
public static void main(String[] args) throws InterruptedException {
	practi obj = new practi();
	obj.launch();

	}

}
