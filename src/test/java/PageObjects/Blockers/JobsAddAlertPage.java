package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsAddAlertPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public JobsAddAlertPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//a[@data-testid='myJobsLink']")
    @CacheLookup
    WebElement btnMyJobs;

    By lnkJobItem = By.xpath("//h4[contains(text(), '2021')]");

    By btnPlusTop = By.xpath("");

    By btnAddAlert = By.xpath("//h6[contains(text(), 'Add Alert')]");




    By btnType_menu = By.xpath("//label[contains(text(), 'Type')]");

    By btnType_menuitem = By.xpath("//span[contains(text(), 'PO')]");

    By txtReason = By.name("reason");

    By btnExpiryDate = By.xpath("//div[@data-testid='Expiry date datePicker']");

    By btnOK = By.xpath("//span[contains(text(), 'OK')]");

    By btnAdd = By.xpath("//button[@data-testid='alertSubmit']");

    //###############################################ACTIONS###########################################################

    public void clickBtnMyJobs() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnMyJobs.click();
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
                ldriver.findElement(lnkJobItem).click();
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

    public void clickBtnPlusTop(WebElement element) {
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

    public void clickBtnPlusTop(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(btnPlusTop).click();
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

    public void clickBtnAddAlert() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddAlert).click();
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
