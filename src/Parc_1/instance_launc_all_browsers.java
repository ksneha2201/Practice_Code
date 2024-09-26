package Parc_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instance_launc_all_browsers {
   WebDriver driver;
   String A = "Chrome";
   String B ="Edge";
   String C= "firefox";
   public void Launch() throws InterruptedException
   {
	   if(A.equalsIgnoreCase("Chrome"))
	   {
		  System.setProperty("wendriver.driver.chromedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  Thread.sleep(3000);
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirt");
		  Thread.sleep(3000);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  Thread.sleep(3000);
		  driver.close();
	   }
	   else if (B.equalsIgnoreCase("edge"))
	   {
		   System.setProperty("wendriver.driver.edgedriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
			  driver = new EdgeDriver();
			  Thread.sleep(2000);
			  driver.get("https://login.salesforce.com/?locale=in");
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  driver.findElement(By.id("username")).sendKeys("shirt");
			  Thread.sleep(2000);
			  driver.findElement(By.id("password")).sendKeys("shirt123");
			  Thread.sleep(2000);
			  driver.findElement(By.id("nav-search-submit-button")).click();
			  Thread.sleep(2000);
			  driver.close();  
	   }
	   else if (C.equalsIgnoreCase("firefox"))
	   {
		   System.setProperty("wendriver.driver.firefoxdriver","C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  Thread.sleep(2000);
			  driver.get("https://www.flipkart.com/");
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("input[placeholder='Search for Products, Brands and More']")).sendKeys("shirt");
			  Thread.sleep(2000);
			  driver.findElement(By.id("nav-search-submit-button")).click();
			  Thread.sleep(2000);
			  driver.close();   
	   }
	   else
	   {
		   System.out.println("not found browser");
	   }
   }
	public static void main(String[] args) throws InterruptedException {
		instance_launc_all_browsers obj = new instance_launc_all_browsers();
		obj.Launch();
	}

}
