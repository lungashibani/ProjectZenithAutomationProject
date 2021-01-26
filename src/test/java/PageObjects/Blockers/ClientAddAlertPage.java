package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientAddAlertPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientAddAlertPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnTopPlus = By.xpath("");

    By btnAddAlert= By.xpath("");

    By btnAlertType= By.id("");

    By btnAdd = By.xpath("");

    //##########################################ACTIONS################################################

    public void clickBtnTopPlus() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnTopPlus).click();
    }

    public void clickBtnAddAlert() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddAlert).click();
    }

    public void clicksBtnAlertType() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAlertType).click();
    }

    public void clickBtnAdd() {
        ldriver.findElement(btnAdd).click();
    }
}
