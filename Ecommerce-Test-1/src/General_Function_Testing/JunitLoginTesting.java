package General_Function_Testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JunitLoginTesting {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test
		public void loginByID() {
			WebDriver driver = Base.getDriver();
			//navigating google website
			driver.get("http://127.0.0.1:8000");		
			WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'login')]"));
			element.click();
			
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("01999999999");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234567");	
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
			WebElement myCart = driver.findElement(By.xpath("//a[contains(@href, 'mycart')]"));
			String myCart_text = myCart.getText();
			
			Assert.assertEquals("My Cart", myCart_text);
			//driver.quit();
			//driver.close();
		}
	//}

}
