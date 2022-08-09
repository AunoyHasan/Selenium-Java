package TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import General_Function_Testing.Base;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		//navigating Online Good Buy and Cell website
		driver.get("http://127.0.0.1:8000");		
		WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'signup')]"));
		element.click();
		
		driver.findElement(By.xpath("/html/body/center/form/div/input[2]")).sendKeys("Aunoy");
		driver.findElement(By.xpath("/html/body/center/form/div/input[3]")).sendKeys("01999999999");
		driver.findElement(By.xpath("/html/body/center/form/div/input[4]")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/center/form/div/input[5]")).sendKeys("123456");	
		driver.findElement(By.xpath("/html/body/center/form/div/input[7]")).click();
		
		//WebElement login = driver.findElement(By.id("login"));
		//String loginText = login.getText();
		//System.out.println(loginText);
		//String myCart_text = myCart.getText();
		//Assert.assertEquals("Login", loginText);

	}

}
