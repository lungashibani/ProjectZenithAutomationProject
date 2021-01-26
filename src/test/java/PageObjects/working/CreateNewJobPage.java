package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class CreateNewJobPage {

    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateNewJobPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@id='signInFormUsername']")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@id='signInFormPassword']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@name='signInSubmitButton']")
    @CacheLookup
    WebElement btnSignIn;

    //@FindBy(xpath = "//*[@id='root']/div/div[3]/button//span[@class='MuiFab-label']")
    @FindBy(xpath = "//button[@aria-label='Universal Plus']")
    @CacheLookup
    WebElement btnUniversalPlusSign;
    By by_of_UniversalPlusSign = By.xpath("//button[@aria-label='Universal Plus']");

    @FindBy(xpath = "//span[@id='UniversalPlus-action-1']")
    @CacheLookup
    WebElement btnCreateJob;

    By txtJobTitle = By.xpath("//input[@name='title']");

    By txtOrganisation_menu = By.id("organisation-lookup");

    //By txtOrganisation_menuitem = By.xpath("//*[@value='Second']");
    By txtOrganisation_menuitem = By.className("MuiAutocomplete-popper");

    By txtLocation_menu = By.id("location-lookup");

    By txtMainClientContact_menu = By.id("client-lookup");

    By lnkJobStatus_menu = By.id("mui-component-select-status");

    By lnkJobStatus_menuitem = By.xpath("//li[@data-value='lead']");

    By lnkAgreementType_menu = By.xpath("//div[@data-testid='agreementTypeDropdown']");


    By lnkExclusiveType_menu = By.xpath("//div[@data-testid='exclusivityTypeDropdown']");

    By lnkSource_menu = By.xpath("//div[@data-testid='sourceDropdown']");


    By lnkJobType_menu = By.xpath("//div[@data-testid='Job Type-label']");





    By btnClientPortal = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div[2]/div/div/button[1]");

    By btnEmailPortal = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div[2]/div/div/button[2]");

    By txtLink = By.xpath("//input[@name='specification']");

    By cbxSelectIfJobPostingIsRequired = By.xpath("//span[@class='MuiIconButton-label']//input[@name='job_posting_required']");

    By txtBackgroundInfo = By.xpath("//div[@class='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-formControl MuiInputBase-multiline MuiFilledInput-multiline']//textarea[@name='background_information']");

    By btnCreate = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']");

    By btnCancel = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text']");

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnView;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnEllipses;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnLinkClientContact;


    @FindBy(xpath = "")
    @CacheLookup
    WebElement txtOrganisation;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement txtClientContact;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnSelect;


//*************************************Actions**********************************************************************

    public void setTxtUsername(String uname) {
        txtUsername.clear();
        txtUsername.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickBtnSignIn() {
        btnSignIn.click();
    }

    public void clickBtnUniversalPlusSign() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_UniversalPlusSign));
        btnUniversalPlusSign.click();
    }

    public void clickBtnCreateJob() {
        btnCreateJob.click();
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

    public void setTxtMainClientContact_menu(String mainClientContact) throws Exception {
        Thread.sleep(3000);

        new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(txtMainClientContact_menu)).sendKeys(mainClientContact.concat(String.valueOf(Keys.ENTER)));
    }

    public void clickMainClientContact_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(txtMainClientContact_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickMainClientContact_menuitem();
    }

    public void clickMainClientContact_menuitem() {
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

    public void clickLnkJobStatus_menuitem() {
        ldriver.findElement(lnkJobStatus_menu).click();
        ldriver.findElement(lnkJobStatus_menuitem).click();
    }


    public void clickLnkAgreementType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(lnkAgreementType_menu).click();
    }

    public void clickLnkAgreementType_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(lnkAgreementType_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickLnkAgreementType_menuitem();
    }

    public void clickLnkAgreementType_menuitem() {
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


    public void clickLnkExclusivityType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(lnkExclusiveType_menu).click();
    }

    public void clickLnkExclusivityType_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(lnkExclusiveType_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickLnkExclusivityType_menuitem();
    }

    public void clickLnkExclusivityType_menuitem() {
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


    public void clickLnkSourceType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(lnkSource_menu).click();
    }

    public void clickLnkSourceType_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(lnkSource_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickLnkSourceType_menuitem();
    }

    public void clickLnkSourceType_menuitem() {
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


    public void clickLnkJobType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(lnkJobType_menu).click();
    }

    public void clickLnkJobType_menuitem_firstOption() {
        //Wait until the list of options is present
        wait.until(ExpectedConditions.presenceOfElementLocated(lnkJobType_menu));
        //Initialize the Actions class
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        clickLnkJobType_menuitem();
    }

    public void clickLnkJobType_menuitem() {
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










    public void clickBtnClientPortal () {
        ldriver.findElement(btnClientPortal);
    }

    public void clickBtnEmailPortalButton () {
        ldriver.findElement(btnEmailPortal);
    }

    public void setTxtLink (String link){
        ldriver.findElement(txtLink).sendKeys(link);
    }

    public void clickCbxSelectIfJobPostingIsRequired () {
        ldriver.findElement(cbxSelectIfJobPostingIsRequired).click();
    }

    public void setTxtBackgroundInfo (String backgroundInfo){
        ldriver.findElement(txtBackgroundInfo).sendKeys(backgroundInfo);
    }

    public void clickBtnCreate () {
        ldriver.findElement(btnCreate).click();
    }

    public void clickBtnCancel () {
        ldriver.findElement(btnCancel).click();
    }

    //######################################View Button###################################################

    //######################################Link Client Contact###########################################

    public void clickBtnEllipses () {
        btnEllipses.click();
    }

    public void clickBtnLinkClientContact () {
        btnLinkClientContact.click();
    }

    public void setTxtOrganisation (String pwd){
        txtOrganisation.clear();
        txtOrganisation.sendKeys(pwd);
    }

    public void setTxtClientContact (String pwd){
        txtClientContact.clear();
        txtClientContact.sendKeys(pwd);
    }

    public void clickBtnSelect () {
        btnSelect.click();
    }
}





