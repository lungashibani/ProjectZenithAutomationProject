package PageObjects.working;

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

public class OrganisationLocationPlusBtnMiddleAddLocationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationLocationPlusBtnMiddleAddLocationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

//    @FindBy(xpath = "//button[@data-testid='open-menu']")
//    @CacheLookup
//    WebElement btnMenuOpen;
    By btnMenuOpen = By.xpath("//button[@data-testid='open-menu']");

    @FindBy(xpath = "//a[@data-testid='organisationsListsLink']")
    @CacheLookup
    WebElement btnOrganisationListLink;



    By lnkOrganisationItem = By.xpath("//h4[contains(text(), 'New test list')]");

    By lnkOrganisationItem_item = By.xpath("//h6[contains(text(), 'Technology One')]");

    By lnkLocation = By.id("scrollable-auto-tab-2");


    By btnLocationPlus = By.xpath("//button[@data-testid='Locations_add_button']");

    By txtLocationName = By.name("name");

    By btnCountry_menu = By.id("mui-component-select-country");

    By getBtnCountry_menuitem = By.xpath("//li[@data-value='AFG']");

    By txtCity = By.name("city");

    @FindBy(xpath = "//button[@data-testid='addLocationSubmit']")
    @CacheLookup
    WebElement btnCreate;


    //#################################################ACTIONS###################################################


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



    //lnkOrganisationItem_item

    public void setLnkLocation() {
        ldriver.findElement(lnkLocation).click();
    }


    public void clickBtnLocationPlus() {
        ldriver.findElement(btnLocationPlus).click();
    }



    public void setTxtLocationName(String locationName) throws Exception {
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtLocationName).sendKeys(locationName);
        }



    public void clickCountry_menuitem() throws Exception{
            Thread.sleep(5000);
            ldriver.findElement(btnCountry_menu).click();
            ldriver.findElement(getBtnCountry_menuitem).click();
        }

    public void setTxtCity(String city) {
        ldriver.findElement(txtCity).sendKeys(city);
    }

    public void clickBtnCreate(){
        btnCreate.click();
    }




}
