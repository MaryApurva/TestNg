package MyParallelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class paralleltest {
	WebDriver driver;
	@Test
	public void test1() throws Exception
	{
		System.out.println("I'm inside test1 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.close();
		
	}
	
//	@Test
//	public void test2() throws Exception
//	{
//		System.out.println("I'm inside test2 | "+Thread.currentThread().getId());
//		
//		System.setProperty("webdriver.gecko.driver", "E:\\Jar files\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://selenium.com");
//		Thread.sleep(3000);
//		driver.close();
//	}
	
	@Test
	public void test3() throws Exception
	{
		System.out.println("I'm inside test3 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.close();
	}
}
