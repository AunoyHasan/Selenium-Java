package General_Function_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		
		//navigating google website
		driver.get("http://127.0.0.1:8000");		
				
		WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'login')]"));
		element.click();
				
		driver.findElement(By.xpath("/html/body/center/form/div/input[1]")).sendKeys("123456");
				
		driver.findElement(By.xpath("/html/body/center/form/div/input[2]")).sendKeys("1234");
				
		driver.findElement(By.xpath("/html/body/center/form/div/input[3]")).click();
	}

}
