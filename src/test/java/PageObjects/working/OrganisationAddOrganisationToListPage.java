package PageObjects.working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationAddOrganisationToListPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationAddOrganisationToListPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }

    By btnMenuOpen = By.xpath("//button[@data-testid='open-menu']");

    @FindBy(xpath = "//a[@data-testid='organisationsListsLink']")
    @CacheLookup
    WebElement btnOrganisationLink;

    By lnkOrganisationItem = By.xpath("//div[@role='grid']//div[7]");

    By lnkOrganisationItem_item = By.xpath("//div[@role='grid']//li[4]");

    By btnAddTo = By.xpath("//div[@data-testid='options-pane']//button[1]");

    By btnAddToList = By.xpath("//li[@role='menuitem']");

    By rbtOrganisation = By.xpath("//div[@role='rowgroup']//div[6]");

    By btnAdd = By.xpath("//button[@data-testid='addToListSubmit']");


    //#########################################ACTIONS############################################

    public void click(WebElement element) {
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

    public void click(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(btnMenuOpen).click();
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


    //###############################################

    public void clickBtnOrganisationLink() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        btnOrganisationLink.click();
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

    public void clickOrganisation_menu(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(lnkOrganisationItem).click();
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


    public void clickOrganisation_menuitem(String css) {
        //https://code.google.com/p/selenium/issues/detail?id=2766 (fix)
        while(true){
            try{
                ldriver.findElement(lnkOrganisationItem_item).click();
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

    public void clickBtnAddToList() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAddTo).click();
        Thread.sleep(5000);
        ldriver.findElement(btnAddToList).click();
    }

    public void clickRbtOrganisation() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(rbtOrganisation).click();
    }

    public void clickBtnAdd() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnAdd).click();

    }

}
