
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {

    public static void main(String[] args) throws InterruptedException {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Locate the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

        usernameField.click();
        passwordField.click();
        loginButton.click();

        // Enter the username and password and click the login button
        usernameField.sendKeys("Admin");
        Thread.sleep(2000);
        passwordField.sendKeys("admin123");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(4000);
        driver.quit();

    }
}
