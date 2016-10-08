package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class navigateeg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://Bing.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().to("http://gmail.com");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();
		
	}

}
