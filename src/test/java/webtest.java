import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class webtest {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("signin2")).click();
        driver.findElement(By.id("sign-username")).sendKeys("swanerbauf");
        driver.findElement(By.id("sign-password")).sendKeys("swanerbaufe");
        driver.findElement(By.cssSelector("button[onclick='register()']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

            driver.findElement(By.id("login2"));

        driver.findElement(By.id("login2"));
        driver.findElement(By.id("loginusername")).sendKeys("swanerbauf");
        driver.findElement(By.id("loginpassword")).sendKeys("swanerbauf");
        driver.findElement(By.className("card-img-top img-fluid")).click();
        driver.findElement(By.className("btn btn-success btn-lg")).click();
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.className("btn btn-success")).click();
        driver.findElement(By.className("form-control")).sendKeys("swanerbaufest");
        driver.findElement(By.id("country")).sendKeys("peru");
        driver.findElement(By.id("city")).sendKeys("lima");
        driver.findElement(By.id("card")).sendKeys("12345678");
        driver.findElement(By.id("month")).sendKeys("enero");
        driver.findElement(By.id("year")).sendKeys("2023");
        driver.findElement(By.className("confirm btn btn-lg btn-primary")).click();

        }








                //driver.quit();







}



