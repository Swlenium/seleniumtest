import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class webtest {
    public static void main(String[] args) throws Exception {
        //driver chrome
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Alquileres/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Espera implicia
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //entrar a la web/
        driver.get("https://www.demoblaze.com/index.html");
        //Registrarse//
        driver.findElement(By.id("signin2")).click();
        driver.findElement(By.id("sign-username")).sendKeys("plutus");
        driver.findElement(By.id("sign-password")).sendKeys("plutus");
        driver.findElement(By.cssSelector("button[onclick='register()']")).click();
        //esperar
        Thread.sleep(3000);

        //Aceptar la alerta
        String alertText = driver.switchTo().alert().getText();
        if (alertText.equals("This user already exist.")) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[2]")).click();
            driver.findElement(By.xpath("//a[@id='login2']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("loginusername")).sendKeys("plutus");
            driver.findElement(By.id("loginpassword")).sendKeys("plutus");
            driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='Sony vaio i5'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='Add to cart'])[1]")).click();
            driver.findElement(By.xpath("(//a[normalize-space()='Cart'])[1]")).click();
            driver.findElement(By.xpath("(//button[normalize-space()='Place Order'])[1]")).click();

            driver.findElement(By.className("form-control")).sendKeys("swanerbauf");
            driver.findElement(By.id("country")).sendKeys("peru");
            driver.findElement(By.id("city")).sendKeys("lima");
            driver.findElement(By.id("card")).sendKeys("12345678");
            driver.findElement(By.id("month")).sendKeys("enero");
            driver.findElement(By.id("year")).sendKeys("2023");
            driver.findElement(By.className("confirm btn btn-lg btn-primary")).click();

        } else {
            // hacer otra cosa aquí
        }















                //driver.quit();



    }



}



