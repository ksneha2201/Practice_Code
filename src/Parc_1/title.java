package Parc_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class title {
	WebDriver driver;
public void AAA() throws InterruptedException
{
	System.setProperty("webdriver.driver.edgedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe\\");
	driver = new EdgeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
}
	public static void main(String[] args) throws InterruptedException {
		title obj =new title();
		obj.AAA();

	}

}

