package General_Function_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralLoginTesting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriver driver = Base.getDriver();
						
				///navigating google website
				//driver.get("http://www.google.com");
						
				//navigating google website
				driver.get("http://127.0.0.1:8000");
						
						
				WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'login')]"));
				element.click();
						
				driver.findElement(By.id("phone")).sendKeys("123456");
						
				driver.findElement(By.id("password")).sendKeys("1234");
						
				driver.findElement(By.id("login")).click();
				
				WebElement myCart = driver.findElement(By.xpath("//a[contains(@href, 'mycart')]"));
				String myCart_text = myCart.getText();
				//System.out.println(myCart_text);
				
				if(myCart_text.equals("My Cart")) {
					System.out.println("Login Successful");
				}else {
					System.out.print("Login failed");
				}

	}

}
