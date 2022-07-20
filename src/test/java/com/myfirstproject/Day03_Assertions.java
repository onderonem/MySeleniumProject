package com.myfirstproject;
import org.junit.Assert;
import org.junit.Test;
public class Day03_Assertions {

    @Test
    public void assertions(){
        /*
         * *****ASSERTIONS*****
         * if expected = actual
         * if assertion fails we see red error
         * if assertion pass we see green checkmark
         * */

//       1.assertEquals("MESSAGE WHEN FAILS", "EXPECTED", "ACTUAL")
//        Assert.assertEquals("TEST CASE IS FAILED!!!","java","javascript");
//        org.junit.ComparisonFailure: TEST CASE IS FAILED!!!
//        Expected :java
//        Actual   :javascript
        Assert.assertEquals(5,5);

        //2. assertTrue(BOOLEAN)
//        Assert.assertTrue("JAVA".contains("E"));
//        java.lang.AssertionError
        Assert.assertTrue("SELENIUM".contains("E"));//PASS
        Assert.assertTrue("JAVA".contains("E")); // FAIL
        // 3. assertFalse(BOOLEAN)
        Assert.assertFalse("JAVA".contains("E"));//PASS
        Assert.assertFalse("SELENIUM".contains("E"));//FAIL



        /*
        What is the difference between Assertion and verification?
        =========================================================
        * When assertion fails, the test stop execution.
          Assertion means Hard assertion

        * Verification means, test continue to execute even after verification fails.
          so, we can see more than one fails in verification.
          Verification means Soft Assertion as well.

        * In TestNG there is Soft Assert, it means verification.
         */








    }
}