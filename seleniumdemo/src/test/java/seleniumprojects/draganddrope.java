package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		
//		Actions action = new Actions(driver);
//		
//		action 
//		.doubleClick(driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]")))
//		.perform();
//		
//		Thread.sleep(3000);
//		
//		WebElement element1 = driver.findElement(By.id("draggable"));
//		WebElement element2 = driver.findElement(By.id("droppable"));
//		
//		action 
//		.dragAndDrop(element1, element2)
//		.perform();
		
		
		
		Actions action = new Actions(driver);
		action
		
		
		//mouse hover action
		.moveToElement (driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"]")))
		.moveToElement(driver.findElement(By.xpath("//a[@href=\"Interactions.html\"]")))
		.perform();
		
		
		WebElement logo1 = driver.findElement(By.id("angular"));
		WebElement logo2 = driver.findElement(By.id("mongo"));
		WebElement logo3 = driver.findElement(By.id("node"));
		
		WebElement area = driver.findElement(By.id("droparea"));
		action
		
		.dragAndDrop(logo3, area)
		
		.dragAndDrop(logo2, area)
		
		.dragAndDrop(logo1, area)
		.perform();
		
	}

}
