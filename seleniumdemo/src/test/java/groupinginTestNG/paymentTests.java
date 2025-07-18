package groupinginTestNG;

import org.testng.annotations.Test;

public class paymentTests {
  
	@Test(priority = 1, groups = {"sanity" , "regression" , "functional"})
	void paymentinRupees()
	{
		System.out.println("payment in Rupees....");
	}
	
	@Test(priority = 2, groups = {"sanity" , "regression" , "functional"})
	void paymentindollars()
	{
		System.out.println("payment in dollars....");
	}
}
