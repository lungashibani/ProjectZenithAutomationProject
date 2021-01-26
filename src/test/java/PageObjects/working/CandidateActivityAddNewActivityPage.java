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

public class CandidateActivityAddNewActivityPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateActivityAddNewActivityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By lnkActivity = By.id("scrollable-auto-tab-1");

    @FindBy(xpath = "//button[@data-testid='ActivityTab-Candidates_add_button']")
    @CacheLookup
    WebElement btnActivityRolesPlus;

    By by_of_btnActivityRolesPlus = By.xpath("//button[@data-testid='ActivityTab-Candidates_add_button']");

    By btnActivityType_menu = By.xpath("//div[@data-testid='activity-type']");

    By by_of_btnActivityType_menu = By.xpath("//span[contains(text(), 'Candidate Call')]");


    By btnCreate = By.xpath("//button[@data-testid='create_activitySubmit']");

    //##################################################ACTIONS##########################################################

    public void clickLnkActivity() {
        ldriver.findElement(lnkActivity).click();
    }

    public void clickBtnActivityRolesPlus() {
        wait.until(ExpectedConditions.presenceOfElementLocated(by_of_btnActivityRolesPlus));
        btnActivityRolesPlus.click();
    }

    public void clickBtnActivityType_menu() throws Exception {
        Thread.sleep(3000);

        //new WebDriverWait(ldriver, 15).until(ExpectedConditions.elementToBeClickable(lnkAgreementType_menu)).click();
        ldriver.findElement(btnActivityType_menu).click();
        ldriver.findElement(by_of_btnActivityType_menu).click();
    }



    public void clickBtnCreate() throws Exception{
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        Thread.sleep(5000);
        ldriver.findElement(btnCreate).click();
    }

}