package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    Create a new class : Homework1

    Using ChromeDriver, Go to facebook and verify if page title is “facebook”,
                        If not, print the correct title.
    Verify if the page URL contains facebook,
                        if not, print the right url.
    Then Navigate to https://www.walmart.com/
    Verify if the walmart page title includes “Walmart.com”
    Navigate back to facebook
    Refresh the page
    Maximize the window
    Close the browser
    */

    public static void main(String[] args) {
        // 1) Set Path
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        // 2) Create chrome driver
        WebDriver driver= new ChromeDriver();

        // 3) Go to Facebook
        driver.get("https://www.facebook.com/");

        // 4) Verify if page title is “facebook”. If not, print the correct title.
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail"+ " Expected Title is : facebook");
        }

        // 5) Verify if facebook homepage url is “www.facebook.com”
        //    If not, print the right url.
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.facebook.com";
        if(actualURL.equals(expectedURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail"+ " Expected Url is: https://www.facebook.com/");
        }

        // 6) Then Navigate to https://www.walmart.com/
        driver.get(" https://www.walmart.com/");

        // 7) Verify if the walmart page title includes “Walmart.com”
        String pageSource=driver.getPageSource();
        if(pageSource.contains("Walmart.com")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        // 8) Navigate back to facebook
        driver.navigate().back();

        // 9) Refresh the page
        driver.navigate().refresh();

        // 10) Maximize the window
        driver.manage().window().maximize();

        // 11) Close/Quit the browser
        // driver.close();
        // or
        driver.quit();


}
}
