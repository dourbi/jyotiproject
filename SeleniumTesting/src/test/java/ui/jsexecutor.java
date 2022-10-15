package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsexecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		JavascriptExecutor jsexec= (JavascriptExecutor) driver;
		String script="return document.tittle;";
	String tittle=(String)jsexec.executeScript(script);
System.out.print(tittle);


//click buton
driver.switchTo().frame("id=\"iframeResult\"");
jsexec.executeScript("myFunction()");
driver.switchTo().alert().accept();
WebElement button=driver.findElement(By.xpath("/html/body/button"));
jsexec.executeScript("arguements[0].style.border='5px solid green'",button);





		driver.quit();
		
	}

}
