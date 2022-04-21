package practice_25_02_2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeckoDriverWdm 
{
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver d=new FirefoxDriver();
	}

}
