package seleniumprojects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SECUNDERABAD JN - SC (SECUNDERABAD)");
		driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_2_list\"]")).sendKeys("VIJAYAWADA JN - BZA (VIJAYAWADA)");
		
		//open calendar
		driver.findElement(By.xpath("//p-calendar[@dateformat=\"dd/mm/yy\"]")).click();
		//choosing the date
		driver.findElement(By.xpath("//a[text()=9]")).click();
		//open the journyclass
		driver.findElement(By.id("journeyClass")).click();
		//choosing the Journyclass
		driver.findElement(By.xpath("//li[@aria-label=\"AC First Class (1A) \"]")).click();
		//open the ticket type 
		driver.findElement(By.xpath("//div[@class=\"ui-dropdown-label-container ng-tns-c65-12\"]")).click();
		//select the ticket type 
		driver.findElement(By.xpath("//li[@aria-label=\"LOWER BERTH/SR.CITIZEN\"]")).click();
		//click on Ok to confirmation 
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		//click on search for finding train
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500);");
		System.out.println(js.executeScript("return windows.pageYoffset"));
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destFile =new File(System.getProperty("user.dir")+"\\Screenshots\\img1.png");
//		source.renameTo(destFile);
//		System.out.println("screeenshot saved successfully");
		
		
		
	}

}

