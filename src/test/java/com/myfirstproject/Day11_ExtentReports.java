package com.myfirstproject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day11_ExtentReports extends TestBase {

    @Test
    public void extentReportTest(){

//      logging the test steps in the report
        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");
        extentTest.skip("User goes to google home page");
        extentTest.warning("User goes to google home page");
        driver.get("https://www.google.com");
        extentTest.info("User search for cybertruck release date");
        driver.findElement(By.name("q")).sendKeys("Tesla Cybertruck release date"+ Keys.ENTER);


        extentTest.pass("Closing the browser");
//     Generating and Ending the report



//       How do we open this report?
//       1- Go to reports
//       2- Right click
//       3- Open in Browser
//       4- Chrome



        //***********************INTERVIEW QUESTIONS*************************//
        /*

                                How do you get the report ?
- When I do manual testing, I capture the screenshot manually and save on a word doc,
   then upload the document to the JIRA
- When I automate the user story, I use "extent reports" for generating the test reports
- Extent reports is customizable.
- I can configure the extent reports based on the project information
- In my project, we customized extent report in a way that it takes the screenshot automatically,
   when test case fails.


                            What are the advantages of extent reports?
- Open source
- Works with different browsers and platform
- It works with different frameworks like junit, testNG, cucumber
- We can log each step
- It is customizable


                    How extent reports generates reports? How extent reports work?
- We are using maven, and I have the extent reports dependency
- I have a reusable class. In that class, I have extent reports configuration
        - Extent reports          |
        - Extent Html Reporter.   |====>>>>>>> are user for generation the reports
        - Extent Tess             |
- For example, Extent reports and extent html reporter can be used for adding custom information
     such as platform, browser, environment,… And extent test object is used for logging the info
     such as pass, fail, working, skip…


                    Where do you get your dependency?
- We have company repository. I check the repo and get the dependency.
- What is the dependency is not in your company repository, then what question?
- I need to raise a request for the dependency so the company can add.(I DO NOT ADD IT)
    I ask the test lead, tech lead, manager,…

         */












    }
}