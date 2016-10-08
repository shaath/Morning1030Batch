package POM;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

public class loginTC extends Constants
{
	@Test
	public void logTest()
	{
		driver.get(lp.url);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		lp.org_Login(lp.u, lp.p);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
