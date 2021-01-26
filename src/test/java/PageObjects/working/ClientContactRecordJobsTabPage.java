package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientContactRecordJobsTabPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientContactRecordJobsTabPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    By btnLinkJobs= By.id("scrollable-auto-tab-3");

    By btnJob_item= By.xpath("//a[@role='button']//h4");


    //###########################################ACTIONS###################################################



    public void clickBtnLinkJobs() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnLinkJobs).click();
    }

    public void clickBtnJobItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnJob_item).click();
    }

}
