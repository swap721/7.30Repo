package SeleniumImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector 
{
	public static void main (String args[]) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		System.out.println("Demowebshop opened");
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("12345");//using # for ID
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("3456");//using single attribute
		driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("gjh@hghg.jhg");//using multiple attributes
		driver.findElement(By.cssSelector("input[data-val-required^='Email']")).sendKeys("swap@yahoo.com");//contains using * symbol
		driver.findElement(By.cssSelector("input[data-val-required*='Email']")).sendKeys("swap@yahoo.com");//starts with using ^ symbol
		driver.findElement(By.cssSelector("input[data-val-required^='Email']")).sendKeys("swap@yahoo.com");//Ends with using $ symbol
		//driver.quit();
		//driver=new ChromeDriver();
		//driver.navigate().to("http://the-internet.herokuapp.com/tables");
		//List col=driver.findElement(arg0)
		
		
		
	}
}
