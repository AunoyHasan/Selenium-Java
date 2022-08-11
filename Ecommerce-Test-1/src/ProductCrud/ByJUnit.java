package ProductCrud;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import General_Function_Testing.Base;

public class ByJUnit {
	
	// Fetch data from database
	//@Test
	public void productList() {
		WebDriver driver = Base.getDriver();
		driver.get("http://127.0.0.1:8000/login");	

		driver.findElement(By.id("name")).sendKeys("ooooo");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ooooo");	
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		//click the product
		driver.findElement(By.xpath("//*[@id=\"nav-manu\"]/ul/li[4]/a[2]")).click();
		
		//driver.findElement(By.cssSelector("body > center:nth-child(7) > form > a")).click();
		//Add-Product text
		String a = driver.findElement(By.cssSelector("body > center:nth-child(7) > form > a")).getText();
		//System.out.println(a);
		Assert.assertEquals("Add Product", a);
	} 
	
	//@Test
	public void AddProduct() {
		WebDriver driver = Base.getDriver();
		driver.get("http://127.0.0.1:8000/login");	

		driver.findElement(By.id("name")).sendKeys("ooooo");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ooooo");	
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		//click the product
		driver.findElement(By.xpath("//*[@id=\"nav-manu\"]/ul/li[4]/a[2]")).click();
		
		//click the Add-Product button
	    driver.findElement(By.xpath("/html/body/center[1]/form/a")).click();
		
		driver.findElement(By.name("pname")).sendKeys("Realme");
		driver.findElement(By.name("quantity")).sendKeys("50");
		driver.findElement(By.name("price")).sendKeys("29000");
		driver.findElement(By.name("category")).sendKeys("Mobile");
		//driver.findElement(By.name("picture")).sendKeys("realme.jpg");
		
		//click the Add-Product button
	    //driver.findElement(By.xpath("/html/body/center/form/div/input[7]")).click();		
	}
	@Test
	public void deleteProduct() {
		WebDriver driver = Base.getDriver();
		driver.get("http://127.0.0.1:8000/login");	

		driver.findElement(By.id("name")).sendKeys("ooooo");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ooooo");	
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
		//click the product
		driver.findElement(By.xpath("//*[@id=\"nav-manu\"]/ul/li[4]/a[2]")).click();
			
		//click the Delete button for 2nd Item
		driver.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[3]/td[6]/a[2]")).click();
						
	}

	//fetch data
//	public static void main(String[] args) {
//		WebDriver driver = Base.getDriver();
//		driver.get("http://127.0.0.1:8000/login");	
//
//		driver.findElement(By.id("name")).sendKeys("ooooo");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ooooo");	
//		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
//		
//		//click the product
//		driver.findElement(By.xpath("//*[@id=\"nav-manu\"]/ul/li[4]/a[2]")).click();
//		
//		//driver.findElement(By.cssSelector("body > center:nth-child(7) > form > a")).click();
//		String a = driver.findElement(By.cssSelector("body > center:nth-child(7) > form > a")).getText();
//		System.out.println(a);
//	}

}
