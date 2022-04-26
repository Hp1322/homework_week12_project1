package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.sql.Timestamp;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find register link and click on register link
        clickOnElement(By.linkText("Register"));


        //expected result
        String expectedResult = "Register";

        String actualMessage = getTextFromElement(By.xpath("//a[contains(text(),'Register')]"));

        //Validate actual and expected message
        Assert.assertEquals("Register link is not opening", expectedResult, actualMessage);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //Find register link and click on register link
//        WebElement registerLink = driver.findElement(By.linkText("Register"));
//        registerLink.click();
        clickOnElement(By.linkText("Register"));

        //select radio gender button
//        WebElement radioButton = driver.findElement(By.id("gender-male"));
//        radioButton.click();
        clickOnElement(By.id("gender-male"));

        //Enter first name
      sendTextToElement(By.name("FirstName"), "Ram");

        //Enter last name
        sendTextToElement(By.name("LastName"), "Patel");

        //Select day, month and year
        //selecting day
        clickOnElement(By.xpath("//select[@name = 'DateOfBirthDay']/option[5]"));

        clickOnElement(By.xpath("//select[@name = 'DateOfBirthMonth']/option[3]"));

        clickOnElement(By.xpath("//select[@name = 'DateOfBirthYear']/option[60]"));

        //Enter email address

        java.sql.Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = "ram"+timestamp.getTime()+"@domain.com";

        sendTextToElement(By.id("Email"), emailAddress);


        sendTextToElement(By.id("Password"), "123456");

        sendTextToElement(By.id("ConfirmPassword"), "123456");

        clickOnElement(By.xpath("//button[@id='register-button']"));

        String expectedResult = "Your registration completed";

        String actualResult = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

        //Validate actual result and expected result
        Assert.assertEquals("Unable to register", expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
