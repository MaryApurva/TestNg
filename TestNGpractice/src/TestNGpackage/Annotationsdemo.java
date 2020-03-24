package TestNGpackage;

import org.testng.annotations.*;


public class Annotationsdemo {
	
	@BeforeSuite
	public void setProperty()
	{
		System.out.println("Set the Property");
	}
	@BeforeTest
	public void checkURL()
	{
		System.out.println("Check URL");
	}
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("URL Launched");
	}
	@BeforeMethod
	public void gettitles()
	{
		System.out.println("Fetch Title");
	}
	@Test
	public void verifyURL()
	{
		System.out.println("URL verified");
	}
	@AfterMethod
	public void checklogin()
	{
		System.out.println("Logged in successfully");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("Logged in unsuccessfully");
	}
	@AfterTest
	public void checkpage()
	{
		System.out.println("correct page");
	}
}
