package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPlusButtonTopAddClientToListNewList {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientPlusButtonTopAddClientToListNewList(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnNewList = By.xpath("");

    By txtListName= By.xpath("");

    By btnCreate= By.xpath("");

    //#######################################################ACTIONS################################################

    public void btnNewList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnNewList).click();
    }

    public void setTxtListName(String listName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickBtnCreate() {

        ldriver.findElement(btnCreate).click();
    }
}
