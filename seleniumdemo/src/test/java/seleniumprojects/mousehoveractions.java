package seleniumprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehoveractions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/realme-Wireless-Earbuds-Spatial-Charging/dp/B0DBGNDTY2/ref=sr_1_3?crid=ATHG9M7NAOW8&dib=eyJ2IjoiMSJ9.CKa5rd5TAmltKrRQ5GR_Bdwm7R5FSoKGfFEynZPouxbZMmpRNp93jz_S5BUb694WFnuI3icJHXhxDBrJ10qIhdSOcIwSjqFL3QRRp7RI7W02MMwiaBYQxnd5mNBPNjnUtqPMF0GXocUGM6TXOJVl7NFMDxKb6eFUlXBA-2KtkXG_mGAfvWWGmaLntu8udQj5ZB4UJ99X890ZOIB4P59e8pIZNoV-xEgOjYf2jUh5jSg.G9IljoIZw15VyNh4W4K6Ch2X22s3EbrbbQXQ4gZIiNI&dib_tag=se&keywords=realme%2Bear%2Bbuds&nsdOptOutParam=true&qid=1751972467&sprefix=%2Caps%2C178&sr=8-3&th=1");

//		Actions action = new Actions(driver);
//		
//		action 
//		.moveToElement(driver.findElement(By.linkText("Mobiles & Accessories")))
//		
//		.moveToElement(driver.findElement(By.linkText("Laptops & Accessories")))
//		.moveToElement(driver.findElement(By.linkText("TV & Home Entertainment")))
//		.moveToElement(driver.findElement(By.linkText("Cameras")))
//		.moveToElement(driver.findElement(By.linkText("Smart Technology")))
//		.moveToElement(driver.findElement(By.linkText("Computer Peripherals")))
//		.click()
//		.perform();
//		
//		driver.navigate().to("https://www.irctc.co.in/nget/booking/train-list");
//		 
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().forward();
//		
//		driver.findElement(By.id("acrCustomerReviewText")).click();
//		
//		driver.navigate().back();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("document.body.style.zoom=2");
//		
		
		
		
	}
    
    

}
