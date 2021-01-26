package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientLinkCandidatePage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientLinkCandidatePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }


    By btnTopThreeDots = By.xpath("");

    By btnLinkCandidate= By.xpath("//li[@role='menuitem']");

    By txtCandidateName= By.id("Candidate-lookup");

    By btnSelect = By.xpath("//button[@data-testid='linkClientSubmit']");

    //###########################################ACTIONS###################################################

    public void setBtnTopThreeDots() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnTopThreeDots).click();
    }

    public void clickBtnLinkCandidate() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnLinkCandidate).click();
    }

    public void setTxtCandidateName(String candidateName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtCandidateName).sendKeys(candidateName);
    }

    public void clickBtnSelect() {
        ldriver.findElement(btnSelect).click();
    }

}
