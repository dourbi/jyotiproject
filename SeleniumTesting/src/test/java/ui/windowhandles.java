package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		//Thread.sleep(2000);
		Set<String> wh =driver.getWindowHandles();
		Iterator<String>it=wh.iterator();
		String parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("jyoti");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Dourbi");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
