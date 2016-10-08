package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methods
{
	public static void main(String[] args) 
	{
		String exptitle="google";
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		// getTitle()
		System.out.println(driver.getTitle());
		String acttitle=driver.getTitle();
		
		if (exptitle.equalsIgnoreCase(acttitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
