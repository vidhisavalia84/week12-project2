package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPassword extends Utility {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void  setup(){
        openBrowser(baseUrl);
    }


@Test
public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']/p"));
    String expectedMessage="Reset Password";
   String actualMessage= getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
   Assert.assertEquals(actualMessage,expectedMessage);
}








    @After
    public void endSession(){
       // closeBrowser();
    }
}
