package com.myfirstproject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Day04_ImplicitWait {

    @Test
    public void implicitWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        implicit wait for 30 seconds
        /*
         * implicit wait puts DYNAMIC WAIT meaning wait will be depends on the page speed
         * We can use implicit wait right after creating the driver object
         * We can use implicit wit once per test. That is enough.
         * Whenever driver is used, then driver will remember the implicit wait
         * If this wait does not enough to download the page, driver will not
           find the elements, so we get NoSuchElement Exception
        */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com");   //puts 3 seconds wait IF NEEDED
       // driver.findElement(By.className("q"));  //puts 3 seconds wait IF NEEDED
        driver.close();
    }
    @Test
    public void threadSleep() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);      //Hard wait. Waits for 5 seconds for no reason
        driver.close();
    }
}