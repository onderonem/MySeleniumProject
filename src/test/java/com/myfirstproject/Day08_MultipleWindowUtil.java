package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day08_MultipleWindowUtil extends TestBase {

    @Test
    public void multipleWindowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        System.out.println("Old Window : " + driver.getCurrentUrl());
        driver.findElement(By.linkText("Click Here")).click();

//        driver is currently on window 1


//        Pass the title of the window that you want to switch to
       switchToTargetWindow("New Window");
        // switchToTargetWindow() method accept the text of the tittle as a parameter,
        // and it automatically switches to that window we write its name
        // Switch to the window whose TITLE = New Window
        System.out.println("Target Window : " + driver.getCurrentUrl());



    }




}
