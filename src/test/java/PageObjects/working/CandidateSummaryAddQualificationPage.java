package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateSummaryAddQualificationPage {

    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateSummaryAddQualificationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//button[@data-testid='qualifications_add_button']")
    @CacheLookup
    WebElement btnMiddlePlus;

    By txtQualification = By.name("name");

    By txtInstitution = By.name("institution");

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd']")
    @CacheLookup
    WebElement btnDateIssued;


    @FindBy(xpath = "//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//button[2]")
    @CacheLookup
    WebElement btnOK;

    By txtGrade = By.name("grade");

    @FindBy(xpath = "//button[@data-testid='qualificationsSubmit']")
    @CacheLookup
    WebElement btnCreate;


    //########################################ACTIONS##########################################################

    public void clickBtnMiddlePlus(){
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnMiddlePlus.click();
    }

    public void setTxtQualification(String qualificationName) {
        ldriver.findElement(txtQualification).sendKeys(qualificationName);
    }

    public void setTxtInstitution(String institutionName) {
        ldriver.findElement(txtInstitution).sendKeys(institutionName);
    }

    public void clickBtnDateIssued(){
        btnDateIssued.click();
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnOK.click();
    }

    public void setTxtGrade(String gradeLevel) {
        ldriver.findElement(txtGrade).sendKeys(gradeLevel);
    }

    public void clickBtnCreate(){
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnCreate.click();
    }

}
