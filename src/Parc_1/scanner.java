package Parc_1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scanner {
	WebDriver driver;
public void LaunchUAt() throws InterruptedException
{
	Scanner a = new Scanner(System.in);
	System.out.println("enter url link");
	String url = a.nextLine();
	System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
}
public void closeAUT()
{
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println("java.net.SocketException");
	}
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		scanner obj = new scanner();
		obj.LaunchUAt();
		obj.closeAUT();
		
	}

}
