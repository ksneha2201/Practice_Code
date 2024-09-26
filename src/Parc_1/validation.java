package Parc_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validation {
	WebDriver driver;
public void Launch() throws InterruptedException
{
	System.setProperty("webdriver.driver.geckdriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe\\");
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
public void valdation()
{
	String s1 ="Login | Salesforce";
    String s2 =driver.getTitle();
    if(s1.equalsIgnoreCase(s2))
    {
    	System.out.println("same");
    }
    else
    {
    	System.out.println("not same");
    }
}
	public static void main(String[] args) throws InterruptedException {
		validation obj = new validation();
		obj.Launch();
		obj.valdation();

	}

}
