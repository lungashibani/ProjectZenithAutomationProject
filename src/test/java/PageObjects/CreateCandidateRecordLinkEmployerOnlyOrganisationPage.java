package PageObjects;

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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.ArrayList;
import java.util.List;

public class CreateCandidateRecordLinkEmployerOnlyOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateCandidateRecordLinkEmployerOnlyOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By txtOrganisation_menu = By.id("employee-organisation-lookup");

    By txtLocation_menuitem =By.id("location-lookup-label");

    @FindBy(xpath = "//button[@data-testid='create_candidateSubmit']")
    @CacheLookup
    WebElement btnCreate;



    //#######################################################ACTIONS################################################


    public void clickOrganisation_menu() {
        ldriver.findElement(txtOrganisation_menu).click();
    }

    public void clickOnOrganisation_menuitem() throws FindFailed {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);

        String filepath = "C:\\Users\\SHIBL\\Desktop\\scripts";

        Screen screen = new Screen();
        Pattern employerOnyOrganisation = new Pattern(filepath + "EmployerOnlyOrganisation.PNG");

        screen.click(employerOnyOrganisation);
    }

    public void setTxtLocation_menuitem() throws Exception{
        Thread.sleep(5000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtLocation_menuitem).click();


    }


    //div[@class='MuiBox-root jss9222 MuiFormHelperText-root Mui-error']

    public void clickBtnCreate(){
        btnCreate.click();
    }

}
