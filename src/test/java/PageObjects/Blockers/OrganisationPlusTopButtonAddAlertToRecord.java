package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationPlusTopButtonAddAlertToRecord {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationPlusTopButtonAddAlertToRecord(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnMenuOpen = By.xpath("//button[@data-testid='open-menu']");

    @FindBy(xpath = "//a[@data-testid='organisationsListsLink']")
    @CacheLookup
    WebElement btnOrganisationListLink;



    By lnkOrganisationItem = By.xpath("//h4[contains(text(), 'New test list')]");

    By lnkOrganisationItem_item = By.xpath("//h6[contains(text(), 'Technology One')]");

    By btnPlusTop = By.xpath("");

    By btnType_menu = By.xpath("");

    By btnType_menuitem = By.xpath("");

    By txtReason = By.xpath("");

    By btnExpiryDate = By.xpath("");

    By btnOK = By.xpath("");

    By btnAdd = By.xpath("");

    //###############################################ACTIONS###########################################

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
                ldriver.findElement(btnMenuOpen).click();
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


    //###############################################

    public void clickBtnOrganisationLink() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnOrganisationListLink.click();
    }


    public void clickOrganisation_menu(WebElement element) {
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

    public void clickOrganisation_menu(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(lnkOrganisationItem).click();
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


    public void clickOrganisation_menuitem(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        Actions actions = new Actions(ldriver);
        //Execute the actions
        actions.pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ARROW_DOWN)
                .pause(500) // 500ms or 0.5s
                .sendKeys(Keys.ENTER)
                .pause(500) // 500ms or 0.5s
                .perform();

        while(true){
            try{
                ldriver.findElement(lnkOrganisationItem_item).click();
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







    public void clickBtnPlusTop() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnPlusTop).click();
    }

    public void clickType_menuitem() throws Exception{
        Thread.sleep(5000);
        ldriver.findElement(btnType_menu).click();
        ldriver.findElement(btnType_menuitem).click();
    }

    public void stTxtReason(String city) {
        ldriver.findElement(txtReason).sendKeys(city);
    }

    public void clickOnBtnExpiryDate(){
        ldriver.findElement(btnExpiryDate).click();
    }

    public void clickOnBtnOK(){
        ldriver.findElement(btnOK).click();
    }

    public void clickOnBtnAdd(){
        ldriver.findElement(btnAdd).click();
    }



}
