package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www2.asx.com.au/");
		List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.print(row.size());
	List<WebElement> cols=	driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div"));
	
		
		System.out.print(cols.size());
		for(int i=1; i<row.size(); i++ ) {
			for(int j=1; j<cols.size(); j++) {
	driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr["+i+" ]/td["+ j + "]")).getText();
		}
		}
		

	}

}
