package practice_25_02_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv=new FirefoxDriver();
		
		rv.get("http://www.google.com");
		rv.get("https://www.google.com/search?q=orangehrm&ie=utf-8&oe=utf-8 ");
		rv.get("https://opensource-demo.orangehrmlive.com/");
		
		By ref=By.id("txtUsername");
		WebElement w=rv.findElement(ref);
		w.sendKeys("admin");
		
		By ref1=By.id("txtPassword");
		WebElement w1=rv.findElement(ref1);
		w1.sendKeys("admin123");
		
		By ref2=By.id("btnLogin");
		WebElement w2=rv.findElement(ref2);
		w2.click();
	}
}
