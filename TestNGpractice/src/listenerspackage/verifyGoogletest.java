package listenerspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
@Listeners({listenerspackage.ListenerImplementationdemo.class}) 
public class verifyGoogletest {
	WebDriver driver;
	@BeforeMethod
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Start up successful");
	}
	@Test 
	public void checkurl()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.google.com/");
		System.out.println("URL checked");
	}
	@Test 
	public void checklogo()
	{
		Boolean logoPresent = driver.findElement(By.id("hplogo")).isDisplayed();
		//System.out.println(logoPresent);
		Assert.assertTrue(logoPresent);
	}
	@AfterMethod 
	public void closebrowser()
	{
		driver.quit();
	}
}
