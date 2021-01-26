package PageObjects.working;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class CandidateRecordModalsMandatoryLocationFieldPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateRecordModalsMandatoryLocationFieldPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By txtOrganisation_menuitem = By.id("employee-organisation-lookup");

    By txtLocation_menuitem =By.id("location-lookup-label");

    @FindBy(xpath = "//button[@data-testid='create_candidateSubmit']")
    @CacheLookup
    WebElement btnCreate;



    //#######################################################ACTIONS################################################


    public void setTxtOrganisation_menu(String organisation) {
        ldriver.findElement(txtOrganisation_menuitem).sendKeys(organisation);
    }

    public void clickOrganisation_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(txtOrganisation_menuitem));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickOrganisation_menuitem();
    }

    public void clickOrganisation_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        java.util.List<By> locators = new ArrayList<>();
        locators.add(txtOrganisation_menuitem);
        for (By locator : locators) {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0) {
                elements.get(0).click();
                break;
            }
        }


    }

    public void setTxtLocation_menuitem(String location) throws Exception{
        Thread.sleep(5000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtLocation_menuitem).sendKeys(location);


    }

    //div[@class='MuiBox-root jss9222 MuiFormHelperText-root Mui-error']

    public void clickBtnCreate(){
        btnCreate.click();
        String bodyText = ldriver.findElement(By.tagName("Location must be provided")).getText();
        Assert.assertTrue("Location must be provided!", bodyText.contains(bodyText));
        System.out.println(bodyText);



        String ExpectedText = "Location must be provided";
        Assert.assertEquals(ExpectedText, "Location must be provided");
    }

}
