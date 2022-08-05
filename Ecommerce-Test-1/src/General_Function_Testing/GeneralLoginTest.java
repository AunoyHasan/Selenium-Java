package General_Function_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Base.getDriver();
		
		///navigating google website
		//driver.get("http://www.google.com");
		
		//navigating google website
		driver.get("http://127.0.0.1:8000");
		
		
		WebElement e1 = driver.findElement(By.xpath("//a[contains(@href, 'login')]"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.id("phone"));
		e2.sendKeys("123456");
		
		WebElement e3 = driver.findElement(By.id("password"));
		e3.sendKeys("1234");
		
		WebElement e4 = driver.findElement(By.id("login"));
		e4.click();


	}

}
