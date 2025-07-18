package testNG.Annatations;

import org.testng.annotations.*;

public class c1 {
	@Test
	void abc()
	{
		System.out.println(" this is abc from c1...");
	}
	@BeforeTest
	void bt()
	{
		System.out.println(" this is beforetest....");
	}
}
