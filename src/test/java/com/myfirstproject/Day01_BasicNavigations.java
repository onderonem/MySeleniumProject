package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
   /*
    Create a new class under : BasicNavigations
    Create main method

    1) Set Path
    2) Create chrome driver
    3) Maximize the window
    4) Open google home page https://www.google.com/
    5) On the same class, Navigate to amazon home page https://www.amazon.com/
    6) Navigate back to google
    7) Navigate forward to amazon
    8) Refresh the page
    9) Close/Quit the browser
*/

    public static void main(String[] args) {
        // 1) Set Path
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        // 2) Create chrome driver
        WebDriver driver= new ChromeDriver();
        // Selenium interact with web pages by using driver object
        // WebDriver and ChromeDriver() come from Selenium Library
        // Selenium Library come from pom.xml dependencies
        // This code creates only empty page (Browser).

        // 3) Maximize the window
        driver.manage().window().maximize();
        // This code is for full screen. We should always automate in full screen page.

        // 4) Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // 5) On the same class, Navigate to amazon home page https://www.amazon.com/
        // 1. Way ==> get()   like number 4)

        // 2. Way ==> navigate.to("Url")
        driver.navigate().to("https://www.amazon.com/ ");

        /*
           There are 2 ways to go to a page:
           1. get("URL")
           2. navigate().to("URL")

             What is the difference between get and navigate?
         => get() is shorter, so easier to use.
         => get() is a little faster.
         => get() takes only string parameter.
         => navigate().to() accept string or URL as parameter.
         => navigate has more options : go back, forward, refresh

         */

        // 6) Navigate back to google
        driver.navigate().back();

        // 7) Navigate forward to amazon
        driver.navigate().forward();

        // 8) Refresh the page
        driver.navigate().refresh();

        // 9) Close/Quit the browser
        driver.close();
        // or
        driver.quit();

        /*
            What is the difference between close and quit?
         => First both closes the driver(browser).
         => close() --->>> closes ONLY the current active driver
         => quit()  --->>> closes ALL browsers that are open during that test run
        */
    }

}
