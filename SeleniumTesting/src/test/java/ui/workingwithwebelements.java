package ui;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingwithwebelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.makemytrip.com/");
		//driver.manage().window().maximize();
		
//		driver.findElement(By.id("email")).sendKeys("jyoitdourbi@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("7456974667");
//		driver.findElement(By.id("pass")).clear();
//		String att=driver.findElement(By.id("pass")).getAttribute("id");
//		System.out.println(att);
//		 String css=driver.findElement(By.id("loginbutton")).getCssValue("background-color");
//		 System.out.println(css);
//	System.out.println(driver.findElement(By.id("loginbutton")).getSize());
//	System.out.println(driver.findElement(By.id("loginbutton")).getLocation());
//	System.out.println(driver.findElement(By.id("loginbutton")).getText());
//	System.out.println(driver.findElement(By.id("loginbutton")).getTagName());
//	System.out.println(driver.findElement(By.id("loginbutton")).isDisplayed());
//	System.out.println(driver.findElement(By.id("loginbutton")).isEnabled());
	//System.out.println(driver.findElement(By.id("loginbutton")).isSelected());
		
		//dropdown handling
		
	 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt"); //
		driver.manage().window().maximize(); //
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Jyoti");
//		String alert=driver.switchTo().alert().getText();
//		System.out.print(alert);
//		driver.switchTo().alert().accept();
		
		driver.switchTo().parentFrame();
		System.out.print(driver.getTitle());
		
//		driver.switchTo().parentFrame();
//		System.out.print(driver.getTitle());
		 //driver.findElement(By.name("email")).sendKeys("jyoitdourbi@gmail.com");
	//	 Thread.sleep(5000);
		//WebElement pl= driver.findElement(By.name("doi"));
		//WebElement ul=driver.findElement(By.id("doi1"));
	//System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		//pl.click();
		
		
		// System.out.println(pl.isSelected());
		 //System.out.println(ul.isSelected());
	/*	 Thread.sleep(5000);
		WebElement cl=driver.findElement(By.id("doi1"));
		Actions action= new Actions(driver);
		action.moveToElement(cl);
		action.perform();
		Thread.sleep(2000);
		 driver.findElement(By.id("interest_market_c0")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("interest_market_c0")).click();
		 
	System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 */
		 
//		 WebElement el=driver.findElement(By.name("employees_c")); // Select select=
//		Select select=  new Select(el); // select.selectByValue("level2"); // Thread.sleep(2000); //
//		 select.selectByVisibleText("11 - 50 employees");
//		 System.out.print(el.isSelected());
//		 
		
//		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
//		System.out.print(alllinks.size());
//		for(int i=0; i<alllinks.size(); i++ ) {
//			System.out.print(alllinks.get(i).getAttribute("href"));
//			System.out.print(alllinks.get(i).getText());
//		}
//		
	
		
//	driver.findElement(By.xpath("//span[text()='From']")).click();
//	
//	WebElement el=	driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
//	el.sendKeys("Toronto-Canada");
//	Thread.sleep(2000);
//		el.sendKeys(Keys.ARROW_DOWN);
//		el.sendKeys(Keys.ENTER);
		driver.quit();
		
		
	}

}
