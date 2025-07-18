package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=4209883897396475241&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062127&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.get("https://www.amazon.in/iPhone-16-Pro-Max-256/dp/B0DGHYDZR9/ref=sr_1_2?crid=2CO5FTWE4DBY&dib=eyJ2IjoiMSJ9.Bise7Tg1QaKxH67Hqqx6ViDvFfDBh0kDUjH9gigjlItCzJNoMDi9R1P5SY82_weUQ3axl8-u9NFfnwUsQf9HVDcXayK8bRZSJJSeqYFEjv55TV7OXwlvxWSqEL8iDXf43fsMp7XLQis1qfW04Hz93OxgwTcIKyjjwomaTl9I-UiypwUeREVM3x0nMZUYQaoCgPP1XEgBxnuhBTa0WZNMK0XzqrcrLjkVX8Sc4NobLSI.IEfIRn59k9aA00K5H15Zh2qjBRWvcsJvu-8m4zhx5uU&dib_tag=se&keywords=i%2Bphones&qid=1751993779&sprefix=%2Caps%2C177&sr=8-2&th=1");
		
		driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-none a-padding-none\"]")).click();
		
		
	}

}
