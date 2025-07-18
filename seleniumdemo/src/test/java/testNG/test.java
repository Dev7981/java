package testNG;

import org.testng.annotations.Test;

/*
 1) open application 
 2) login
 3) logout 
 */


public class test 
{
	@Test(priority=1)
	void open () 
	{
		System.out.println("opening the application...");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login to the application...");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from the application...");
	}
}
