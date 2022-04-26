package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find computer tab link and click on computer tab
        clickOnElement(By.linkText("Computers"));

        //expected result
        String expectedResult = "Computers";

        //Actual Result
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        //Validate actual and expected message
        Assert.assertEquals("Tab open unsuccessfully", expectedResult, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find electronics tab link and click on electronics tab
        clickOnElement(By.linkText("Electronics"));

        //expected result
        String expectedResult2 = "Electronics";

        //actual result
        String actualresult = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        //validate actual and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult2, actualresult);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Find apparel tab link and click on apparel tab link
        clickOnElement(By.linkText("Apparel"));

        //expected result
        String expectedResult = "Apparel";

        //actual result
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
//        //Find digital downloads tab link and click on digital download tab
        clickOnElement(By.linkText("Digital downloads"));

        //expected result
        String expectedResult4 = "Digital downloads";
        //actual result
        String actualResult = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult4, actualResult);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Find book page tab link and click on book page tab
        clickOnElement(By.linkText("Books"));

        //expected result
        String expectedResult5 = "Books";
        //actual result
        String actualresult = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult5, actualresult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find jewelry tab link and click on jewelry tab link
        clickOnElement(By.linkText("Jewelry"));

        //expected result
        String expectedResult6 = "Jewelry";
        //actual result
        String actualresult = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));


        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult6, actualresult);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Find giftcard tab link and click on giftcard tab link
        clickOnElement(By.linkText("Gift Cards"));

        //expected result
        String expectedResult7 = "Gift Cards";
        //actual result
        String actualresult = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));


        //Validate actual result and expected result
        Assert.assertEquals("Tab open unsuccessfully", expectedResult7, actualresult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
