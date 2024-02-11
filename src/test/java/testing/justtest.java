package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class justtest {

	
	public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			Actions a=new Actions(driver);
			
			driver.get("https://www.flipkart.com/");
			
			WebElement appliances = driver.findElement(By.xpath("//span[text()='Appliances']"));
			appliances.click();
			
			WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
			a.moveToElement(tv).perform();
			
			WebElement mi = driver.findElement(By.xpath("//a[text()='Mi']"));
			a.click(mi).perform();
			
			WebElement firstproduct = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a"));
			firstproduct.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}
	}
