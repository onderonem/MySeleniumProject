package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_xpath_css {

    WebDriver driver;


    @Before
    public void setUp(){
//        Prerequisites
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
    }


    @Test
    public void xpath_css(){
        // Locating username, password, and button using xpath
        driver.findElement(By.xpath("//input[@type='email']")).
                sendKeys("testtechproed@gmail.com");     // Email
        driver.findElement(By.xpath("//input[@type='password']")).
                sendKeys("Test1234!");                   // Password
        driver.findElement(By.xpath("//input[@type='submit']")).
                click();                                             // Sign in
    }


    @Test
    public void css(){
        /*
        Locating username, password, and button using cssSelector
        At css there is no //, and  there is no @ symbol
        */
        driver.findElement(By.cssSelector("input[type='email']")).          // Email
                sendKeys("testtechproed@gmail.com");

        // Alternative css locator for email: input#session_email or #session_email
        // Alternative css locator for email: input.form-control or .form-control
        // # ==> id     . ==> class
        driver.findElement(By.cssSelector("input[type='password']")).        //Password
                sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click();  //Sign in
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}