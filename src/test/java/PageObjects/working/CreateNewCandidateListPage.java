package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;


public class CreateNewCandidateListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CreateNewCandidateListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//button[@aria-label='Universal Plus']")
    @CacheLookup
    WebElement btnUniversalPlusSign;
    By by_of_UniversalPlusSign = By.xpath("//button[@aria-label='Universal Plus']");


    By btnList = By.xpath("//button[@aria-describedby='UniversalPlus-action-4-label']");


    By btnCandidate = By.xpath("//div[@class='MuiButtonGroup-root MuiButtonGroup-fullWidth MuiButtonGroup-contained']//button[1]");

    By txtListName = By.xpath("//input[@data-testid='list-name']");

    By btnCreate = By.xpath("//button[@data-testid='record_listSubmit']");

    //##############################################################ACTIONS#####################################################################


    public void clickBtnUniversalPlusSign() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_UniversalPlusSign));
        btnUniversalPlusSign.click();
    }

    public void clickBtnList() {
        ldriver.findElement(btnList).click();
    }

    public void clickBtnCandidate() {
        ldriver.findElement(btnCandidate).click();
    }

    public void setTxtListName(String listName) {
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickBtnCreate() {
        ldriver.findElement(btnCreate).click();
    }
}
