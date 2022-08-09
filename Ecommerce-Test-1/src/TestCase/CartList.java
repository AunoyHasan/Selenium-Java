package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import General_Function_Testing.Base;

public class CartList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		driver.get("http://127.0.0.1:8000");		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"product\"]/div/p/a"));
		element.click();
		driver.findElement(By.xpath("/html/body/center/a[1]")).click();
		
		WebElement checkOut = driver.findElement(By.xpath("/html/body/form/input[3]"));
		//String chekOut_text = checkOut.getText();
		//System.out.println(chekOut_text);
		
	}

}
