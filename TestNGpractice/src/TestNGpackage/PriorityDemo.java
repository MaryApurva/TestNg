package TestNGpackage;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test (description="Test case to start application")
	public void startapp()
	{
		System.out.println("Start application");
	}
	
	@Test (priority=1,description="Test case to check login")
	public void loginapp()
	{
		System.out.println("Successful Loggin");
	}
	@Test (priority=2,description="Test case to verify logout")
	public void signoff()
	{
		System.out.println("Successful Logout");
	}
}
