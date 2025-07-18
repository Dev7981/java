package testNG.Annatations;

import org.testng.annotations.*;

public class c2 {
    @Test
	void xyz()
	{
		System.out.println(" this is xyz from c2");
	}
	@AfterTest
	void at()
	{
		System.out.println(" this is  aftertest...");
	}
}
