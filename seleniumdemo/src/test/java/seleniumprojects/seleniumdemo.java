package seleniumprojects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme ear poads");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.get("https://www.amazon.in/realme-Wireless-Earbuds-Spatial-Charging/dp/B0DBGNDTY2/ref=sr_1_3?crid=ATHG9M7NAOW8&dib=eyJ2IjoiMSJ9.CKa5rd5TAmltKrRQ5GR_Bdwm7R5FSoKGfFEynZPouxbZMmpRNp93jz_S5BUb694WFnuI3icJHXhxDBrJ10qIhdSOcIwSjqFL3QRRp7RI7W02MMwiaBYQxnd5mNBPNjnUtqPMF0GXocUGM6TXOJVl7NFMDxKb6eFUlXBA-2KtkXG_mGAfvWWGmaLntu8udQj5ZB4UJ99X890ZOIB4P59e8pIZNoV-xEgOjYf2jUh5jSg.G9IljoIZw15VyNh4W4K6Ch2X22s3EbrbbQXQ4gZIiNI&dib_tag=se&keywords=realme%2Bear%2Bbuds&nsdOptOutParam=true&qid=1751972467&sprefix=%2Caps%2C178&sr=8-3&th=1");
		
		Actions action = new Actions (driver);
		//action
		//.moveToElement(driver.findElement(By.linkText("Mobiles & Accessories")))
		//.moveToElement(driver.findElement(By.linkText("Laptops & Accessories")))
		//.moveToElement(driver.findElement(By.linkText("Samsung")))
		
		//.perform();
		
		action 
		.contextClick(driver.findElement(By.id("productTitle")))
		.perform();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500);");
//		System.out.println(js.executeScript("return windows.pageYoffset"));
//		Thread.sleep(3000);
		
		
		//driver.findElement(By.id("a-autoid-4-announce")).click();
		
	}

}

