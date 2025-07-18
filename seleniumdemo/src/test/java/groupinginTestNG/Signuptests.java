package groupinginTestNG;

import org.testng.annotations.Test;

public class Signuptests {
  
	@Test(priority=1 , groups = {"regression"})
	void signupByEmail()
	{
		System.out.println("this is signup by Email...");
	}
	@Test(priority=2 , groups = {"regression"})
	void  signupByfacebook()
	{
		System.out.println("this is signup by facebook....");
	}
	@Test(priority=3 , groups = {"regression"})
	void signupBytwitter()
	{
		System.out.println("this is signup by twitter....");
	}
}
