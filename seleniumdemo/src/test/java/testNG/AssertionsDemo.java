package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
  
	@Test
	void testTitle()
	{
		String exp_title = "opencart";
		String act_title = "opencart";
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("test passed..");
//		}
//		else
//		{
//			System.out.println("test failed");
//			
//		}
		
		
		
		
	//	Assert.assertEquals(exp_title, act_title);
		
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed...");
			Assert.assertTrue(false);
		}
		
		
	}
}
