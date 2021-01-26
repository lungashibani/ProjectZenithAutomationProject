package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatePlusTopButtonAddToListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidatePlusTopButtonAddToListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnAddToList= By.xpath("//h6[contains(text(), 'Add to list')]");

    By btnListItem = By.name("75491c64-4603-4d39-aae1-3a2ca12f71ea");

    By btnAdd = By.xpath("//button[@data-testid='addToListSubmit']");

    //###########################################ACTIONS################################################

    public void clickBtnAddToList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddToList).click();
    }

    public void clicksListItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnListItem).click();
    }

    public void clickBtnAdd(){
        ldriver.findElement(btnAdd).click();
    }
}
