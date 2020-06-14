/*
 * 1. Set up - open browser and application
 * 2. Login -
 * 3. Close
 * */

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("Open browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("Closing browser");
    }

}
