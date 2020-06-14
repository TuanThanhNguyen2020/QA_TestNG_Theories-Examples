import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsExamples {

    WebDriver driver;
    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();

    }

    @BeforeMethod
    void openHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not display on the page");
        //Assert.assertFalse(logo.isDisplayed(),"Logo displays on the page");
    }

    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        //Assert.assertEquals(title,"OrangeHRM123","Title is not matched");
        Assert.assertEquals(title,"OrangeHRM","Title is not matched");
    }

//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }
}
