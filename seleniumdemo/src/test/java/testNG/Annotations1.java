package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations1 {
  
	
	WebDriver driver;
	WebDriver wait;
	
	@BeforeClass
	void login() throws InterruptedException
	{
		
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		System.out.println("this is login...");
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("this is logout....");
		driver.quit();
	}
	@Test(priority=1)
	void search()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");
		System.out.println("this is search.....");
	}
	
	@Test(priority=2)
	void advancedsearch() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		System.out.println("this is advancedsearch.....");
		Thread.sleep(3000);
	}
}
