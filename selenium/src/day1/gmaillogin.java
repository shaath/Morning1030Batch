package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		
//		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("1234567890");
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
