package SeleniumImplementation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class session 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement w = driver.findElement(By.id("search"));
		driver.findElement(By.id("search")).sendKeys("msd");
		driver.findElement(By.id("search")).clear();
		w.sendKeys("msd");
		w.clear();
		//w.sendKeys("MSD");
		//driver.findElement(By.id("search-icon-legacy")).click();

	}
}






