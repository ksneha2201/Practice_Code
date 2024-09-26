package Parc_1;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_browser {	
	
public void LaunchAUT()

{
	System.setProperty("webdriver.driver.chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
}

	public static void main(String[] args) {
	maximize_browser obj = new maximize_browser();	
	obj.LaunchAUT();
	}

}
