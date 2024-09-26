package Parc_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class negative_testcase {
	static WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.driver.Chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}
public void send_data(String username, String password) throws InterruptedException
{
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	Thread.sleep(4000);
}
	public static void main(String[] args) throws InterruptedException {
		negative_testcase obj = new negative_testcase();
		obj.LaunchAUT();
		obj.send_data("Admin","dmin123");
		obj.send_data("dmin","min123");
		obj.send_data("Adin","dmn123");
		driver.close();
	}

}
