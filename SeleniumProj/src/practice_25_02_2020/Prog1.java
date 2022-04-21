package practice_25_02_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv=new FirefoxDriver();

		rv.get("http://www.amazon.in");
		
		By ref=By.id("nav-link-accountList");
		WebElement w=rv.findElement(ref);
		w.click();
		Thread.sleep(2000);
		
		By ref1=By.id("createAccountSubmit");
		WebElement w1=rv.findElement(ref1);
		w1.click();
		Thread.sleep(2000);
		
		By ref2=By.id("ap_customer_name");
		WebElement w2=rv.findElement(ref2);
		w2.sendKeys("Swapnil matkar");
		Thread.sleep(2000);
		
		By ref3=By.id("ap_phone_number");
		WebElement w3=rv.findElement(ref3);
		w3.sendKeys("7773999721");
		Thread.sleep(2000);
		
		By ref4=By.id("ap_email");
		WebElement w4=rv.findElement(ref4);
		w4.sendKeys("matkarswapnil123@gmail.com");
		Thread.sleep(2000);
		
		By ref5=By.id("ap_password");
		WebElement w5=rv.findElement(ref5);
		w5.sendKeys("swapnil@123");
		Thread.sleep(2000);
		
		By ref6=By.id("continue");
		WebElement w6=rv.findElement(ref6);
		w6.click();
	}
}
