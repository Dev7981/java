package parametrizationiTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Dataproviderdemo {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "Dp")
    void login(String username, String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[contains(text(),'Dashboard')]")));
            Assert.assertTrue(true, "Login successful");
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail("Login failed for user: " + username);
        }
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "Dp")
    public Object[][] loginData() {
        return new Object[][] {
            {"Admine", "admin12334"},
            {"admin", "Adminf@321"},
            {"Adnun", "Admin@098"},
            {"Admin", "adminn@123"},
            {"Admin", "admin123"} // correct credentials
        };
    }
}
