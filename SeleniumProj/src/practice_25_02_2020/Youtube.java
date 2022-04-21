package practice_25_02_2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		//Thread.sleep(5000);
		WebElement w = driver.findElement(By.id("search"));
		w.sendKeys("java");
		Thread.sleep(1000);
		w.clear();
		//driver.findElement(By.id("search-icon-legacy")).click();
		//w.clear();
		/*WebElement w1 = driver.findElement(By.id("search"));
		w1.sendKeys("sher aya sher");
		w1.clear();
		driver.findElement(By.id("search-icon-legacy")).click();*/
		
		
		
	}
}
