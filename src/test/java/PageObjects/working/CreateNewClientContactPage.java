package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class CreateNewClientContactPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateNewClientContactPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//span[@id='UniversalPlus-action-2']")
    @CacheLookup
    WebElement btnClientContact;

    By txtFirstName = By.xpath("//input[@name='first_name']");

    By txtFamilyName = By.xpath("//input[@name='family_name']");


    @FindBy(xpath = "//div[@data-testid='Gender-label']//div")
    @CacheLookup
    WebElement btnDropdownGender;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='male']")
    @CacheLookup
    WebElement btnSelectsGender;

    By txtJobTitle = By.xpath("//input[@name='job_title']");

    //###########################organisation#########################################
    By txtOrganisation_menu = By.id("organisation-lookup");

    //By txtOrganisation_menuitem = By.xpath("//*[@value='Second']");
    By txtOrganisation_menuitem = By.className("MuiAutocomplete-popper");

    By txtLocation_menu = By.id("location-lookup");

    //###########################################################################################


    @FindBy(xpath = "//button[@data-testid='addPositionContactsButton']")
    @CacheLookup
    WebElement btnCurrentPositionContactDetails;

    @FindBy(xpath = "//li[@data-testid='mobile-contact-option']")
    @CacheLookup
    WebElement btnMobilePhone;

    By txtMobilePhone = By.xpath("//input[@name='phoneNumber']");

    By txtBackgroundInfo = By.xpath("//textarea[@name='background_information']");

    @FindBy(xpath = "//button[@data-testid='create_clientSubmit']")
    @CacheLookup
    WebElement btnCreate;

    //##################################################ACTIONS####################################//


    public void clickBtnClientContact() {
        btnClientContact.click();
    }

    public void setTxtFirstName(String firstName) {
        ldriver.findElement(txtFirstName).sendKeys(firstName);
    }

    public void setTxtFamilyName(String familyName) {
        ldriver.findElement(txtFamilyName).sendKeys(familyName);
    }


    public void clickBtnSelectsGender() {
        btnDropdownGender.click();
    }

    public void clickBtnDropdownGender() {
        btnSelectsGender.click();
    }

    public void setTxtJobTitle(String jobTitle) {
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle);
    }

    //#####################################organisation################################################

    public void setTxtOrganisation_menu(String organisation) {
        ldriver.findElement(txtOrganisation_menu).sendKeys(organisation);
    }

    public void clickOrganisation_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(txtOrganisation_menuitem));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickOrganisation_menuitem();
    }
    public void clickOrganisation_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtOrganisation_menuitem);
        List<By> locators = new ArrayList<>();
        locators.add(txtOrganisation_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }


    }

    public void setTxtLocation_menu(String location_menu) throws Exception{
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(txtLocation_menu)).click();
    }

    public void clickLocation_menuitem_firstOption() {
        //Wait until the list of options is present
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtLocation_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickLocation_menuitem();
    }
    public void clickLocation_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtOrganisation_menuitem);
        List<By> locators = new ArrayList<>();
        //locators.add(txtOrganisation_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }


    }



    public void clickBtnCurrentPositionContactDetails() {
        btnCurrentPositionContactDetails.click();
    }

    public void clickBtnMobilePhone() {
        btnMobilePhone.click();
    }

    public void setTxtMobilePhone(String mobilePhone) {
        ldriver.findElement(txtMobilePhone).sendKeys(mobilePhone);
    }

    public void setTxtBackgroundInfo(String backgroundInfo) {
        ldriver.findElement(txtBackgroundInfo).sendKeys(backgroundInfo);
    }

    public void clickCreate() {
        btnCreate.click();
    }



















}
