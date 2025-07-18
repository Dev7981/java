package testNG;

import org.testng.annotations.*;


public class Allannatations {
	
	
	@BeforeSuite
	void bs()
	{
		System.out.println(" this is beforersuite...");
	}
	@AfterSuite()
	void as()
	{
		System.out.println(" this is aftersuite....");
	}	
	@BeforeTest
	void bt()
	{
		System.out.println(" this is beforetest....");
	}	
	@AfterTest
	void at()
	{
		System.out.println(" this is  aftertest...");
	}
	@BeforeClass()
	void bc()
	{
		System.out.println(" this before class...");
	}
	@AfterClass()
	void ac()
	{
		System.out.println(" this after class...");
	}	
	@BeforeMethod()
	void bm()
	{
		System.out.println(" this before method...");
	}	
	@AfterMethod()
	void am()
	{
		System.out.println(" this after method..");
	}
	@Test
	void t2()
	{
		System.out.println(" this is  t2 c2...");
	}
	@Test
	void t1()
	{
		System.out.println(" this is t1 c1...");
	}
}
