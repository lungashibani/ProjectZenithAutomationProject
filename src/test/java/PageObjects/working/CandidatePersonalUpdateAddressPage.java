package PageObjects.working;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CandidatePersonalUpdateAddressPage {

    public WebDriver ldriver;
    public WebDriverWait wait;
    public WebDriver getWebriver;

    public CandidatePersonalUpdateAddressPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
        getWebriver = new ChromeDriver();
    }

    By lnkPersonal = By.id("scrollable-auto-tab-2");

    @FindBy(xpath = "//button[@data-testid='change_address_button']")
    @CacheLookup
    WebElement btnChangeAddress;
    By by_of_BtnChangeAddress = By.xpath("//button[@data-testid='change_address_button']");

    By btnCountry_menu = By.id("mui-component-select-country");

    By btnCountry_menuitem = By.xpath("//li[@data-value='ALB']");


    By txtAddressLine1 = By.name("address_line_1");

    By txtCity = By.name("city");

    By txtProvince = By.name("province");

    By txtPostCode = By.name("postcode");

    @FindBy(xpath = "//button[@data-testid='update_addressSubmit']")
    @CacheLookup
    WebElement btnSave;

    //#################################################ACTIONS##################################################

    public void clickLnkPersonal() {
        ldriver.findElement(lnkPersonal).click();
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
                ldriver.findElement(by_of_BtnChangeAddress).click();
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

    //#############################################################

    private WebDriver getWebDriver() {
        return getWebriver;
    }

    public void clickBtnCountry_menuitem() {
        ldriver.findElement(btnCountry_menu).click();
        ldriver.findElement(btnCountry_menuitem).click();
    }

    public void setTxtAddressLine1(String addressLine1Name) {
        ldriver.findElement(txtAddressLine1).sendKeys(addressLine1Name);
    }

    public void setTxtCity(String cityName) {
        ldriver.findElement(txtCity).clear();
        ldriver.findElement(txtCity).sendKeys(cityName);
    }

    public void setTxtProvince(String provinceName) {
        ldriver.findElement(txtProvince).sendKeys(provinceName);
    }

    public void setTxtPostCode(String postCodeNumber) {
        ldriver.findElement(txtPostCode).sendKeys(postCodeNumber);
    }

    public void clickBtnSave(){
        btnSave.click();
    }






}
