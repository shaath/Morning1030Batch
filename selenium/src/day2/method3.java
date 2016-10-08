package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class method3 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//getPageSource()
		System.out.println(driver.getPageSource());
		
//		driver.close();
		
		driver.quit();
		
		WindowsUtils.killByName("eclipse.exe");
	}
}
