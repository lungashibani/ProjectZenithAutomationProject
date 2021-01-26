package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientContactRecordRemoveCandidatePage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientContactRecordRemoveCandidatePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnThreeDots= By.id("");

    By btnUnlinkCandidate= By.xpath("");


    //###########################################ACTIONS###################################################



    public void clickBtnThreeDots() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnThreeDots).click();
    }

    public void clickBtnUnlinkCandidate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnUnlinkCandidate).click();
    }

}
