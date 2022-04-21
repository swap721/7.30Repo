package practice_25_02_2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class operaWDM {
	public static void main(String[] args) {
		WebDriverManager.operadriver().setup();
		WebDriver rv=new OperaDriver();
	}

}
