package seleniumprojects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testautomaationpractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("kane williamson");
		driver.findElement(By.id("email")).sendKeys("williamson@123");
		driver.findElement(By.id("phone")).sendKeys("9876543218");
		driver.findElement(By.id("textarea")).sendKeys("New Zealand");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("saturday")).click();
		WebElement Mondaychk = driver.findElement(By.id("monday"));
		Mondaychk.click();
		Thread.sleep(3000);
		if(Mondaychk.isSelected())
			Mondaychk.click();
		
		WebElement Country = driver.findElement(By.id("country"));
		Select countryDropdown = new Select(Country);
		countryDropdown.selectByVisibleText("France");
		//first calendar
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		//second calendar
		driver.findElement(By.id("txtDate")).click();
		 WebElement Yeardrp = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		 Select YeardrpDropdown  = new Select(Yeardrp);
		 YeardrpDropdown.selectByVisibleText("2015");
		 
		WebElement Monthdrp = driver.findElement(By.xpath("//select[@data-handler=\"selectMonth\"]"));
		Select MonthdrpDropdown = new Select(Monthdrp);
		MonthdrpDropdown.selectByVisibleText("Feb");
		
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		//third calendar
		driver.findElement(By.id("start-date")).sendKeys("21-09-2002");
		
		driver.findElement(By.id("end-date")).sendKeys("10-07-2025");
		
		//submit button
		driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).click();
		
//		driver.findElement(By.id("blog-pager")).click();
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.findElement(By.linkText("2")).click();
		driver.findElement(By.linkText("3")).click();
		
		Actions action = new Actions(driver);
		action
		
		.doubleClick(driver.findElement(By.xpath("//input[@value=\"Hello World!\"]"))).perform();
		
		
		Thread.sleep(3000);
		
		action
		
		.moveToElement(driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")))
		.perform();
		
		
		action
		.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		action 
		.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		action 
		.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(3000);
		action 
		.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		
		
		
		
	}
}

