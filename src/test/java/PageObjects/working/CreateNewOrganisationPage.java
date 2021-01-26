package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateNewOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//button[@aria-describedby='UniversalPlus-action-3-label']")
    @CacheLookup
    WebElement btnOrganisation;

    By txtOrganisation = By.xpath("//input[@data-testid='name']");

    By txtLocation = By.name("location.name");

    By btnCountry_menu = By.id("mui-component-select-location.country");

    By getBtnCountry_menuitem = By.xpath("//li[@data-value='AFG']");

    By txtCity = By.name("location.city");

    @FindBy(xpath = "//button[@data-testid='create_organisationSubmit']")
    @CacheLookup
    WebElement btnCreate;


    //#############################################ACTIONS##################################################

    public void clickBtnOrganisation(){
        btnOrganisation.click();
    }

    public void setTxtOrganisation(String organisation) {
        ldriver.findElement(txtOrganisation).sendKeys(organisation);
    }

    public void setTxtLocation(String location) {
        ldriver.findElement(txtLocation).sendKeys(location);
    }

    public void clickCountry_menuitem() {
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
