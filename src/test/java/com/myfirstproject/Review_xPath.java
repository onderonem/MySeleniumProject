package com.myfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Review_xPath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement add = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        add.click();

        WebElement delete=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(delete.isDisplayed()){
            System.out.println("Delete test is passed");
        }else{
            System.out.println("Delete test is failed");
        }


        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();

        WebElement addRemove = driver.findElement(By.xpath("//button"));

if(addRemove.isDisplayed()){
    System.out.println("addRemove test is passed");
}else{
    System.out.println("addRemove test is failed");
}
        Thread.sleep(3000);
driver.close();
    }
}
