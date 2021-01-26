package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateCareerAddNewRolePage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateCareerAddNewRolePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By lnkCareer = By.id("scrollable-auto-tab-3");

    @FindBy(xpath = "//button[@data-testid='currentRole_add_button']")
    @CacheLookup
    WebElement btnCurrentRolesPlus;
    By by_of_btnCurrentRolesPlus = By.xpath("//button[@data-testid='currentRole_add_button']");

    By txtJobTile = By.name("job_title");

    By btnPositionType_menu = By.id("mui-component-select-position_type");

    By btnPositionType_menuitem = By.xpath("//li[@data-value='perm']");

    By txtRate = By.name("value");

    By btnPayPeriod_menu = By.id("mui-component-select-period");

    By btnPayPeriod_menuitem = By.xpath("//li[@data-value='per_month']");

    By btnAdd = By.xpath("//button[@data-testid='addRoleSubmit']");


    //######################################ACTIONS#####################################################

    public void clickLnkCareer() {
        ldriver.findElement(lnkCareer).click();
    }

    public void clickBtnCurrentRolesPlus() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_btnCurrentRolesPlus));
        btnCurrentRolesPlus.click();
    }

    public void setTxtJobTile(String jobTitleName){
        ldriver.findElement(txtJobTile).sendKeys(jobTitleName);
    }

    public void clickBtnPositionType(){
        ldriver.findElement(btnPositionType_menu).click();
        ldriver.findElement(btnPositionType_menuitem).click();
    }

    public void setTxtRate(String rateAmount){
        ldriver.findElement(txtRate).sendKeys(rateAmount);
    }

    public void clickBtnPayPeriod(){
        ldriver.findElement(btnPayPeriod_menu).click();
        ldriver.findElement(btnPayPeriod_menuitem).click();
    }

    public void clickBtnAdd(){
        ldriver.findElement(btnAdd).click();
    }

}
