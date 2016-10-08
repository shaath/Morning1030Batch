package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class checkboxeg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		Sleeper.sleepTightInSeconds(5);
		if (check.isSelected()) 
		{
			System.out.println("It is in selected position");
			check.click();
		}
		else
		{
			System.out.println("It is not  in selected position");
			check.click();
		}

	}

}
