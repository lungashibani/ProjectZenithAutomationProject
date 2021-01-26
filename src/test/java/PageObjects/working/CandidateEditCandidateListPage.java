package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidateEditCandidateListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public CandidateEditCandidateListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver,10);
    }

    @FindBy(xpath = "//a[@data-testid='candidatesListsLink']")
    @CacheLookup
    WebElement btnCandidateList;

    By btnPersonalList = By.xpath("//h4[contains(text(), 's a list')]");

    By btnEdit = By.xpath("//button[@data-testid='edit-icon']");

    By txtListName = By.xpath("//input[@data-testid='list-name']");

    By btnUpdate = By.xpath("//button[@data-testid='update_list_nameSubmit']");

    //##############################################################ACTIONS#####################################################################

    public void clickBtnCandidateList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnCandidateList.click();
    }


    public void clickOrganisation_menu(WebElement element) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                element.click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void clickBtnPersonalList(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(btnPersonalList).click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void clickBtnEdit() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnEdit).click();
    }

    public void setTxtListName(String listName) throws Exception{
        ldriver.findElement(txtListName).clear();
        Thread.sleep(3000);
        ldriver.findElement(txtListName).sendKeys(listName);
    }

    public void clickBtnUpdate() {
        ldriver.findElement(btnUpdate).click();
    }
}
