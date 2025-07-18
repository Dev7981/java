package groupinginTestNG;

import org.testng.annotations.Test;

public class loginTests {
  
	@Test(priority=1 , groups = {"sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by Email....");
	}
	
	@Test(priority=2 , groups = {"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is login by facebook...");
	}
	
	@Test(priority=3 ,groups = {"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is login by twitter....");
	}
}
