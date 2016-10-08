package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations
{
	@Test(priority=0)
	public void test1()
	{
		System.out.println("This is Test1 code");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("This is Test2 code");
	}
	@Test(priority=2)
	public void setup()
	{
		System.out.println("This is intial setup");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is after method");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test");
	}

	@AfterTest
	public void at()
	{
		System.out.println("This is After Test");
	}
}
