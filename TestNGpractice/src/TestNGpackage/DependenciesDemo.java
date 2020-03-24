package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependenciesDemo {
	WebDriver driver;
	
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	}
	//@Test (priority=1) if the test failed then next test is executed
	//instead of priority you can also use below syntax
	// if the test failed then next test is not executed
	@Test (dependsOnMethods="startapp")
	public void checktitle()
	{
		String title=driver.getTitle();
		System.out.println(title);

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
	
}
