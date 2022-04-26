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

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));


        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        //Validate actual and expected message
        Assert.assertEquals("Not navigate to sign in page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));

        // Find the email field element
        sendTextToElement(By.id("Email"), "kp@yahoo.com");

        //Find the password field element
        sendTextToElement(By.name("Password"), "123456");
        //Click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));


        //expected result
        String expectedMsg = "Log out";

        //actual result
        String actmsg = getTextFromElement(By.linkText("Log out"));

        Assert.assertEquals("Unable to Log out",expectedMsg, actmsg);

        //Find log out link and click on logout
        WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        logOut.click();

    }
    @Test
    public void verifyTheErrorMessage(){
        //Find log in link and click on log in
        clickOnElement(By.linkText("Log in"));

        //Find email field element
        sendTextToElement(By.id("Email"),"123@gmail.com");

        //Find password field element
        sendTextToElement(By.name("Password"), "123456");

        //Click on login button
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualErrorMessage = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));

        // Validate actual and expected message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);

    }
   @After
    public void tearDown(){
        closeBrowser();
   }



}
