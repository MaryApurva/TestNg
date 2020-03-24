package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alwaysrun {
WebDriver driver;
	
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	}
	@Test (dependsOnMethods="startapp")
	public void checktitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Demo Web Shop");
	}
	@Test(dependsOnMethods="checktitle")
	public void loginapp()
	{
		//driver=new ChromeDriver();
		driver.findElement(By.id("Email")).sendKeys("apurvareddy1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("apurvareddy");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@Test (dependsOnMethods="loginapp")
	public void signoff()
	{
		driver.findElement(By.linkText("Log out")).click();
		
	}
	@Test (dependsOnMethods="signoff",alwaysRun=true)
	public void closebrowser()
	{
		driver.close();
	}
	
}
