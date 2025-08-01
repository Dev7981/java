package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangehrmtest {
	
	WebDriver driver;
	
	@Test(priority=0)
	void openapp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("the logo displayed..."+status);
		
	}
	@Test(priority=2)
	void testlogin() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("(//h5[normalize-space()='Login'])[1]")).click();
	}
	@Test(priority=3)
	void testlogout() {
		driver.quit();
		
	}
}
