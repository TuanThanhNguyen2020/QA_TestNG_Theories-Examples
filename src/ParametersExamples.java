import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExamples {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser, String app){
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\geckodriver\\geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("opera")){
            System.setProperty("webdriver.opera.driver","C:\\Users\\StarGlobal\\Testing\\Drivers\\operadriver\\81.0.4044.113\\operadriver_win64\\operadriver.exe");
            driver=new OperaDriver();
        }
        driver.get(app);
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not display on the page");
    }

    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM","Title is not matched");
    }

//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }
}
