package day7;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropdownops {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("g-popup-close")).click();
		
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		
		
		Select f=new Select(fdrop);
		
//		f.selectByIndex(5);
//		
//		Sleeper.sleepTightInSeconds(5);
//		
//		f.selectByValue("14|Pune");
//		
//		Sleeper.sleepTightInSeconds(5);
//
//		f.selectByVisibleText("Mumbai");
		
		List<WebElement> flist=f.getOptions();
		
		
		System.out.println(flist.size());
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		
		Select t=new Select(tdrop);
		
		
		for (int i = 0; i < flist.size(); i++)
		{
			f.selectByIndex(i);
			String fText=flist.get(i).getText();
			System.out.println(fText);
			
			List<WebElement> tlist=t.getOptions();
			
			for (int j = 0; j < tlist.size(); j++) 
			{
				t.selectByIndex(j);
				String tText=tlist.get(j).getText();
				if (fText.equalsIgnoreCase(tText))
				{
					flag=true;
					break;
				}
			}
			
			if (flag)
			{
				System.out.println("The From City Available in The to City : Fail");
			}
			else
			{
				System.out.println("The From City Not Available in The to City : Pass");

			}
		}
		
	}

}
