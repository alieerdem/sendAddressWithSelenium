package automation;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObject.pageObjects;

public class sendAdress extends BaseClass {
	
	@Test
	public void sendAddress()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Go to link
		driver.navigate().to(baseUrl);
		
		//Click on contact from header
		driver.findElement(By.xpath("//*[@id='menu-item-2015']/a/span")).click();
		
		//Enter address informations on message box
		pageObjects.messageBox.sendKeys(
				pageObjects.address1.getText() + Keys.ENTER + Keys.ENTER + 
						pageObjects.address2.getText() + Keys.ENTER + Keys.ENTER + 
							pageObjects.address3.getText() + Keys.ENTER + Keys.ENTER + 
								pageObjects.address4.getText());
		
		//Click on Send button to submit form
		pageObjects.sendButton.click();
		
		//Get alert message
		String alertMessage = pageObjects.alert.getText();
		
		//Check the alert message and see if message is successfully sent
		assertEquals(pageObjects.messageSentSuccessfully, alertMessage);
	}
}
