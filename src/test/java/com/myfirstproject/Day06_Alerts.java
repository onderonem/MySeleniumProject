package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
public class Day06_Alerts extends TestBase {


    @Test
    public void acceptAlert() throws InterruptedException {
//                  acceptAlert()
//
//      click on the first alert,
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);

//        switch to the alert and getText and doing assertion
//        verify the text “I am a JS Alert” ,
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Alert";
        Assert.assertEquals(expectedAlertText,actualAlertText);

//      click OK
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

//        and Verify “You successfully clicked an alert”
        String actualResultText = driver.findElement(By.id("result")).getText();
        String expectedResultText = "You successfully clicked an alert";
        Assert.assertEquals(expectedResultText,actualResultText);
    }


    @Test
    public void dismissAlert() throws InterruptedException {
//    dismissAlert()
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        click on the second alert,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);

//    verify text "I am a JS Confirm”,
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Confirm";
        Assert.assertEquals(expectedAlertText,actualAlertText);

//    click cancel
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);

//    and Verify “You clicked: Cancel”
        String expectedResultText="You clicked: Cancel";
        String actualResultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expectedResultText,actualResultText);
    }


    @Test
    public void sendKeysAlert() throws InterruptedException {

//           sendKeysAlert()
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//    => click on the third alert,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);

//    verify text “I am a JS prompt”,
        Assert.assertEquals("I am a JS prompt",   // expected
                driver.switchTo().alert().getText());      // actual

//    type “Hello World”,
        driver.switchTo().alert().sendKeys("Hello World");

//    click OK,
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

//    and Verify “You entered: Hello World”
        Assert.assertEquals("You entered: Hello World",   // expected
                driver.findElement(By.id("result")).getText());    // actual
    }
}