package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/*
 
 1) login
 2) search
 3) logout
 4) login 
 5) advanced search
 6) logout 
 
 */
import org.testng.annotations.Test;


public class Annotations {
	
	@BeforeMethod
	void login()
	{
		System.out.println("this is login");
	}
	
	@Test(priority= 1)
	void search()
	{
		System.out.println("this is search");
	}
	
	@Test(priority=2)
	void Advancedsearch()
	{
		System.out.println("this is advanced search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout");
	}
  
}
