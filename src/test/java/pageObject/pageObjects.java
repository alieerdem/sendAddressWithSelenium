package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import automation.BaseClass;

public class pageObjects {
	
	//Locators
	public static By contact = By.xpath("//*[@id='menu-item-2015']/a/span");
	
	//Elements
	public static WebElement contactButton = BaseClass.driver.findElement
			(By.xpath("//*[@id='menu-item-2015']/a/span"));
	
	public static WebElement address1 = BaseClass.driver.findElement(
			By.xpath("//*[@id=\"page-14\"]/div[10]/div[1]/div/div[1]/div/div[2]/p[2]/span"));
	
	public static WebElement address2 = BaseClass.driver.findElement(
			By.xpath("//*[@id=\"page-14\"]/div[10]/div[1]/div/div[2]/div/div[2]/p[2]/span"));
	
	public static WebElement address3 = BaseClass.driver.findElement
			(By.xpath("//*[@id=\"page-14\"]/div[10]/div[1]/div/div[1]/div/div[3]/div/div/div[2]/p[2]/span"));
	
	public static WebElement address4 = BaseClass.driver.findElement(
			By.xpath("//*[@id=\"page-14\"]/div[10]/div[1]/div/div[2]/div/div[4]/p[2]/span"));
	
	public static WebElement messageBox = BaseClass.driver.findElement
			(By.xpath("//*[@id=\"responsive-form\"]/div[3]/div/span/textarea"));
	
	public static WebElement alert = BaseClass.driver.findElement
			(By.xpath("//*[@id=\"wpcf7-f2072-p14-o2\"]/form/div[3]"));
	
	public static WebElement sendButton = BaseClass.driver.findElement(By.xpath("//*[@id='responsive-form']/div[4]/div[2]/input"));
	
	//Alert messages
	public static String messageSentSuccessfully= "Thank you for your message. It has been sent.";
}
