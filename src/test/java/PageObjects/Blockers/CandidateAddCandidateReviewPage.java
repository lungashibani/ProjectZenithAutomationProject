package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateAddCandidateReviewPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateAddCandidateReviewPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnPlusTop;
    By by_of_btnPlusTop = By.xpath("");

    By btnCandidateReview = By.xpath("//ul[@role='menu']//li[3]");

    By txtNotesReview = By.name("//textarea[@rows='1']");

    By btnCreate = By.xpath("//button[@data-testid='addToCandidateReviewSubmit']");


    //######################################ACTIONS#####################################################


    public void clickPlusBtnTop() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_btnPlusTop));
        btnPlusTop.click();
    }

    public void clickBtnCandidateReview(){
        ldriver.findElement(btnCandidateReview).click();
    }

    public void setTxtNotesReview(String textReview){
        ldriver.findElement(txtNotesReview).sendKeys(textReview);
    }

    public void clickBtnCreate(){
        ldriver.findElement(btnCreate).click();
    }
}
