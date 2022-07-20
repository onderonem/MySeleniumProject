package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Review1 {
    /*
        Create a new class : Review1
        Using ChromeDriver,
        1) Go to youtube
        2) Verify if page title is “youtube”, If not, print the correct title.
        3) Verify if the page URL contains youtube if not, print the right url.
        4) Then Navigate to https://www.amazon.com/
        5) Navigate back to youtube
        6) Refresh the page
        7) Navigate forward to amazon
        8) Maximize the window
        9) Then verify if page title includes “Amazon”, If not, print the correct title.
        10) Verify if the page URL is https://www.amazon.com/, if not print the correct url
        11) Quit the browser

    */
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1) Go to youtube
        driver.get("http://www.youtube.com");

        // 2) Verify if page title is “youtube”, If not, print the correct title.
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " Expected Title is : youtube");
        }

        // 3) Verify if the page URL contains youtube if not, print the right url.

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.youtube.com";
        if (actualURL.equals(expectedURL)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail" + " Expected Url is: https://www.youtube.com");
        }

        // 4) Then Navigate to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 5) Navigate back to youtube
        driver.navigate().back();

        // 6) Refresh the page
        driver.navigate().refresh();

        // 7) Navigate forward to amazon
        driver.navigate().forward();

        // 8) Maximize the window
        driver.manage().window().maximize();

        // 9) Then verify if page title includes “Amazon”,
        //    If not, print the correct title.
        String actualPageTitle = driver.getTitle();

        // 10) Quit the browser
        driver.quit();




       /* String expectedPageTitle = “Amazon”;
        if (actualPageTitle.equals(expectedPageTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("FAIL" + " Expected Page Tittle is: " + expectedPageTitle);

        }
        10) Quit the browser
        driver.quit();

        */
    }
}