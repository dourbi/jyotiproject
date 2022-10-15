package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
//		WebElement d=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		driver.switchTo().frame(d);
//		WebElement drag=driver.findElement(By.id("draggable"));
//		WebElement drop=driver.findElement(By.id("droppable"));
//		Actions action= new Actions(driver);
//		Thread.sleep(2000);
//		action.dragAndDrop(drag, drop).perform();
		
		
		//Resixeable
		
//		driver.switchTo().frame(0);
//	WebElement resize=	driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//	Actions action =new Actions(driver);
//	action.dragAndDropBy(resize, 10, 50).perform();

		// slider
//		driver.switchTo().frame(0);
//	WebElement slider=	driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
//	Actions action= new Actions(driver);
//	action.dragAndDropBy(slider, -100, -50).perform();
		
		//rightclick
		driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		
		Actions action = new Actions(driver);
		action.contextClick(a).perform();
		
		driver.quit();
		
	}

}
