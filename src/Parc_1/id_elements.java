package Parc_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_elements {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.driver.Chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();	
}
public void send_data() throws InterruptedException
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 15 pro");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(2000);
driver.close();
}

	public static void main(String[] args) throws InterruptedException {
		id_elements obj = new id_elements();
		obj.LaunchAUT();
		obj.send_data();

	}

}
