package Parc_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_the_browser {
	
public void LunchAUT()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
}
	public static void main(String[] args) {
		launch_the_browser obj = new launch_the_browser();
		obj.LunchAUT();

	}

}
