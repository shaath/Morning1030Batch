package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttonseg1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		List<WebElement> radios=driver.findElements(By.xpath(".//*[@id='SearchForm']/nav/ul/li/label/input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String rText=radios.get(i).getAttribute("value");
			System.out.println(rText);
			if (rText.equalsIgnoreCase("RoundTrip"))
			{
				radios.get(i).click();
				break;
			}
			
		}
	}
	

}
