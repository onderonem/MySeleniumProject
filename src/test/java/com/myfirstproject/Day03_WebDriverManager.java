package com.myfirstproject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day03_WebDriverManager {
    @Test
    public void googleSearch(){
//        Verify the Google title
//        Set Path
//
//    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//        System.setProperty comes from Java


//    We no longer need to use System.setProperty
//    Instead use WebDriverManager
//    Calling and setting up chromedriver
        WebDriverManager.chromedriver().setup();
        // it comes from bonigarcia library
        // it is easy, and simpler than System.setProperty

//    Create chrome driver
        WebDriver driver = new ChromeDriver();

//    Maximize the window
        driver.manage().window().maximize();

//    Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().equals("Google"));
    }
}
