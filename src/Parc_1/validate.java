package Parc_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class validate {
	WebDriver driver;
public void LuanchUAT() throws InterruptedException
{
	System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\sneha kothapally\\OneDrive\\Documents\\Selenium Files\\Selenium Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void Abc(){
	String exp = "Login | Salesforce";
	String Act = driver.getTitle();
	if(exp.equalsIgnoreCase(Act))
	{
		System.out.println("both are same");
	}
	else
	{
		System.out.println("not same");
	}
}
	public static void main(String[] args) throws InterruptedException {
		validate obj = new validate();
		obj.LuanchUAT();
		obj.Abc();
	}
		
	}

