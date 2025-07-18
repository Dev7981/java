package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
  
	//@Test
	void Hardassertion()
	{
		System.out.println(" Executing....");
		System.out.println(" Executing....");
		
		//Assert.assertEquals(1,2);
		
		System.out.println(" print in console");
		System.out.println(" print in console");
	}
	@Test
	void softAssertion()
	{
		System.out.println(" Executing....");
		System.out.println(" Executing....");
		
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1,2);            //Soft Assertion
		
		System.out.println(" print in console");
		System.out.println(" print in console");
		
		
		sa.assertAll();      //mandatory step for Soft Assertion
	}
}
