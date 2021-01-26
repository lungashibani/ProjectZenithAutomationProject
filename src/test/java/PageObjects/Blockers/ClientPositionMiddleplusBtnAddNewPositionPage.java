package PageObjects.Blockers;

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

public class ClientPositionMiddleplusBtnAddNewPositionPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientPositionMiddleplusBtnAddNewPositionPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }


    @FindBy(xpath = "//a[@data-testid='allClientsLink']")
    @CacheLookup
    WebElement LnkClient;

//    @FindBy(xpath = "//div[@role='grid']//div[9]")
//    @CacheLookup
//    WebElement LnkClientItem;
    By LnkClientItem = By.xpath("//div[@role='grid']//div[9]");

    By lnkInformation = By.id("scrollable-auto-tab-2");

    By btnPositionHistoryPlus = By.xpath("//button[@data-testid='client-positions_add_button']");

    By txtJobTitle = By.xpath("//input[@data-testid='job-title']");

    By txtOrganisation_menu = By.id("organisation-lookup");

    //By txtOrganisation_menuitem = By.xpath("//*[@value='Second']");
    By txtOrganisation_menuitem = By.className("MuiAutocomplete-popper");

    By txtLocation_menu = By.id("location-lookup");


    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd']")
    @CacheLookup
    WebElement txtDuration;
    By by_for_txtDuration= By.xpath("//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd']");


    @FindBy(xpath = "//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//button[2]")
    @CacheLookup
    WebElement btnOK;
    By by_for_bntOK= By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//button[2]");

    By txtCurrentlyAtThiRole= By.xpath("");

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnCurrentPositionContactDetails;

    @FindBy(xpath = "//li[@data-testid='mobile-contact-option']")
    @CacheLookup
    WebElement btnMobilePhone;

    By txtMobilePhone = By.name("phoneNumber");

    @FindBy(xpath = "//button[@data-testid='create_clientSubmit']")
    @CacheLookup
    WebElement btnCreate;


    //#################################################ACTIONS###################################################


    public void clickLnkClient() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        LnkClient.click();
    }


    public void click(WebElement element) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                element.click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void click(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(LnkClientItem).click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }


    public void setLnkInformation() {
        ldriver.findElement(lnkInformation).click();
    }


    public void clickBtnPositionHistoryPlus() {
        ldriver.findElement(btnPositionHistoryPlus).click();
    }


    public void setTxtJobTitle(String jobTitle) {
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle);
    }

    public void setTxtOrganisation_menu(String organisation) {
        ldriver.findElement(txtOrganisation_menu).sendKeys(organisation);
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
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        //ldriver.findElement(txtOrganisation_menuitem);
        List<By> locators = new ArrayList<>();
        locators.add(txtOrganisation_menuitem);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators) {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0) {
                elements.get(0).click();
                break;
            }
        }
    }

    public void setTxtLocation_menu(String location_menu) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(txtLocation_menu)).click();
    }

    public void clickLocation_menuitem_firstOption() {
        //Wait until the list of options is present
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtLocation_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
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

        for (By locator : locators) {
            List<WebElement> elements = ldriver.findElements(locator);

            if (elements.size() > 0) {
                elements.get(0).click();
                break;
            }
        }


    }


    public void setTxtDuration() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_for_txtDuration));
        txtDuration.click();
    }

    public void clickBtnOK() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_for_bntOK));
        btnOK.click();
    }

    public void clickBtnCurrentlyAtThiRole() {
        ldriver.findElement(txtCurrentlyAtThiRole).click();
    }

    public void clickBtnCurrentPositionContactDetails() throws Exception{
        Thread.sleep(5000);
        btnCurrentPositionContactDetails.click();
    }

    public void clickBtnMobilePhone() {
        btnMobilePhone.click();
    }

    public void setTxtMobilePhone(String mobilePhone) throws Exception{
        Thread.sleep(5000);
        ldriver.findElement(txtMobilePhone).sendKeys(mobilePhone);
    }

    public void clickCreate() {
        btnCreate.click();
    }


}
