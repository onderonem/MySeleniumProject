package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
public class Day06_TestBaseDemo extends TestBase {

//    WebDriver driver;
//    @Before
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
   
    }

//    @After
//    public void tearDown(){
//        driver.quit();
//    }

    }

    //       Expected order:
    //=> setUp => test1 => tearDown
    //=> setUp => test2 => teardown


    //                What we did here?
    // 1. We made commend out Before and After Methods
    // 2. We made extends Day06_TestBaseDemo class to TestBase class
    // 3. We made driver object protected in the Test Base class. so,
    //    we can use it in each child classes

    // So, now our test class is very simple (atomic).

