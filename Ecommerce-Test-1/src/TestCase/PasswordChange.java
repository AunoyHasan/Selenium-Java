package TestCase;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import General_Function_Testing.Base;
public class PasswordChange {
	//public static void main(String[] args) {
		@Test
		public void chnagePassword() {
			WebDriver driver = Base.getDriver();
			driver.get("http://127.0.0.1:8000/login");	

			driver.findElement(By.id("name")).sendKeys("ooooo");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");	
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
			//click the setting
			driver.findElement(By.xpath("//*[@id=\"nav-manu\"]/ul/li[8]/a[2]")).click();		
			//click change password button
			driver.findElement(By.xpath("/html/body/h3/a")).click();
			// write the current password
			driver.findElement(By.name("password")).sendKeys("12345");
			// write the new password
			driver.findElement(By.name("new_password")).sendKeys("ooooo");
			// write the confirm password
			driver.findElement(By.name("conf_password")).sendKeys("ooooo");
			//click the update button
			driver.findElement(By.cssSelector("body > center:nth-child(7) > form > div > input:nth-child(11)")).click();
			String a = driver.findElement(By.xpath("/html/body/h3/a")).getText();
			//System.out.println(a);
			Assert.assertEquals("Change Password", a);

			
		}
	//}

}
