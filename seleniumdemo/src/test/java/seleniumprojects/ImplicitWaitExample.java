package seleniumprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Set implicit wait globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.irctc.co.in/nget/train-search");

        // Selenium will wait up to 10 seconds to find this element
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.quit();
    }
}