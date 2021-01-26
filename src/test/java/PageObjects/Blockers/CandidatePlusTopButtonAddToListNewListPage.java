package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatePlusTopButtonAddToListNewListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidatePlusTopButtonAddToListNewListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnAddToList= By.xpath("//h6[contains(text(), 'Add to list')]");

    By txtListName = By.name("name");

    By btnCreate = By.xpath("//button[@data-testid='create_record_listSubmit']");

    //###########################################ACTIONS################################################

    public void clickBtnNewList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddToList).click();
    }

    public void setTxtOnListName(String listName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickOnBtnCreate(){
        ldriver.findElement(btnCreate).click();
    }
}
