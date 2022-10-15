package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.selenium.dev/documentation/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
//		driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();

		
		//driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//	System.out.print(driver.getCurrentUrl());	
		//	System.out.print(driver.getTitle());	
		

//		//input[contains(@name,"UserLastName")]
//		driver.findElement(By.xpath("//input[starts-with(@name,\"UserFirstName\")]")).sendKeys("xyz");
//		driver.findElement(By.xpath("//input[contains(@name,\"UserLastName\")]")).sendKeys("xyz");
//		driver.findElement(By.xpath("//button[text()='start my free trial']")).click();
//		//Thread.sleep(2000);
//		driver.navigate().to("https://www.youtube.com/");
//			
//		driver.quit();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();

		//driver.findElement(By.id("login-button")).click();
		
		
		List<WebElement> element= driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div"));
		System.out.println(element);
		
		
		driver.navigate().to("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com&utm_medium=referral");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
	//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);

		driver.close();
		//System.out.print("True");
		
		

	}

}
