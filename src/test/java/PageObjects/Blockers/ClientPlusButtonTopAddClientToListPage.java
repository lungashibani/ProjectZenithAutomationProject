package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPlusButtonTopAddClientToListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public ClientPlusButtonTopAddClientToListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }


    By btnListItem = By.xpath("//input[@name='08783336-477b-411a-8beb-55d2b428e808']");

    By btnAdd= By.xpath("//button[@data-testid='addToListSubmit']");

    //###############################################ACTIONS#########################################

    public void clickLnkListItem() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnListItem).click();
    }

    public void clickBtnAdd() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAdd).click();
    }

}
