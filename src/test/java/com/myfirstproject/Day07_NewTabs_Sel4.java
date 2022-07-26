package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;
public class Day07_NewTabs_Sel4 extends TestBase {
    @Test
    public void newTabs() throws InterruptedException {

//        Open google on TAB 1
        driver.get("https://www.google.com");
        System.out.println("Google Title : " + driver.getTitle());
        String googleWindowHandle = driver.getWindowHandle();//get the window1 handle

//        Open amazon on TAB 2
        driver.switchTo().newWindow(WindowType.TAB);//creating a new tab and switch to that window
        driver.get("https://www.amazon.com");//opening the page on this tab
        System.out.println("Amazon Title : "+driver.getTitle());
        String amazonWindowHandle = driver.getWindowHandle();

//        Open linkedin on tab 3
        driver.switchTo().newWindow(WindowType.TAB);//creating a new tab and switch to that window
        driver.get("https://www.linkedin.com");//opening the page on this tab
        System.out.println("Linkedin Title : "+driver.getTitle());
        String linkedinWindowHandle = driver.getWindowHandle();

//        Switch between tabs
//        Switch to amazon
        Thread.sleep(5000);
        driver.switchTo().window(amazonWindowHandle);
        System.out.println("AMAZON : " +driver.getTitle());

//        Switch to google
        Thread.sleep(5000);
        driver.switchTo().window(googleWindowHandle);
        System.out.println("GOOGLE : "+ driver.getTitle());

//        Switch back to linkedin
        Thread.sleep(5000);
        driver.switchTo().window(linkedinWindowHandle);
        System.out.println("LINKEDIN : "+driver.getTitle());
    }
}
