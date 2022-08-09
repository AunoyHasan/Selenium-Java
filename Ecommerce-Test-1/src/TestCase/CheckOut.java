package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import General_Function_Testing.Base;

public class CheckOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		driver.get("http://127.0.0.1:8000");	
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'login')]"));
		element.click();
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("01999999999");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");	
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"product\"]/div/p/a")).click();
		driver.findElement(By.xpath("/html/body/center/a[2]")).click();
		
		WebElement checkOut = driver.findElement(By.xpath("/html/body/form/input[3]"));
		checkOut.click();
		//String chekOut_text = checkOut.getText();
		//System.out.println(chekOut_text);

	}

}
