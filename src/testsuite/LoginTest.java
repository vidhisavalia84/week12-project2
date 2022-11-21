package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setuBrowser() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredential(){
        seneTextToElement(By.xpath("//input[@name='username'and@placeholder='Username']"),"Admin");
        seneTextToElement(By.xpath("//input[@name='password'and@placeholder='Password']"),"admin123");
        clickOnElement(By.xpath("//button[@type='submit']"));
        String expectedMessage = "Dashboard";
       String actualMessage= getTextFromElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));
       Assert.assertEquals(actualMessage,expectedMessage);
    }
    @After
    public void close(){
        closeBrowser();
    }

}