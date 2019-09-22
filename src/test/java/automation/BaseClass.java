package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.testng.Reporter;

public class BaseClass  {
	
	public static WebDriver driver;
	static String baseUrl = "https://evam.com/";

	@BeforeClass
	public static void setupApplication()
	{
		Reporter.log("### Browser Session START ###", true);
		
        System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		Reporter.log("----Application Start----", true);
	}
	
	@AfterClass
	public static void closeApplication()
	{
		driver.quit();
		Reporter.log("### Browser Session END ###", true);
	}

}
