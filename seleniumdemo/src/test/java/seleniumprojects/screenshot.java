package seleniumprojects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/realme-Wireless-Earbuds-Spatial-Charging/dp/B0DBGNDTY2/ref=sr_1_3?crid=ATHG9M7NAOW8&dib=eyJ2IjoiMSJ9.CKa5rd5TAmltKrRQ5GR_Bdwm7R5FSoKGfFEynZPouxbZMmpRNp93jz_S5BUb694WFnuI3icJHXhxDBrJ10qIhdSOcIwSjqFL3QRRp7RI7W02MMwiaBYQxnd5mNBPNjnUtqPMF0GXocUGM6TXOJVl7NFMDxKb6eFUlXBA-2KtkXG_mGAfvWWGmaLntu8udQj5ZB4UJ99X890ZOIB4P59e8pIZNoV-xEgOjYf2jUh5jSg.G9IljoIZw15VyNh4W4K6Ch2X22s3EbrbbQXQ4gZIiNI&dib_tag=se&keywords=realme%2Bear%2Bbuds&nsdOptOutParam=true&qid=1751972467&sprefix=%2Caps%2C178&sr=8-3&th=1");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme earpods");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("realme Buds T310 Truly Wireless in Ear Earbuds with 46dB Hybrid ANC, 360° Spatial Audio, 12.4mm Dynamic Bass Driver, Upto 40Hrs Battery and Fast Charging (Agile White)")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destFile =new File(System.getProperty("user.dir")+"\\Screenshots\\img2.png");
		source.renameTo(destFile);
		System.out.println("screeenshot saved successfully");
		
	
	}

}
