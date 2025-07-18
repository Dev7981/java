package testNG.Annatations;

import org.testng.annotations.*;

public class c3 {
  
	@Test
	void pqr()
	{
		System.out.println(" this is pqr from c3...");
	}
	@AfterSuite()
	void as()
	{
		System.out.println(" this is aftersuite....");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println(" this is beforersuite...");
	}
}
