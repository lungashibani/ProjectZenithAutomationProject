package PageObjects.Blockers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganisationLinkedJobsSubsidiaryOrganisationPage {
    public WebDriver ldriver;
    public WebDriverWait wait;

    public OrganisationLinkedJobsSubsidiaryOrganisationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        wait = new WebDriverWait(ldriver, 10);
    }


    By lnkLinkedOrgs = By.id("scrollable-auto-tab-5");

    By btnSubsidiaryOrganisation = By.xpath("//button[@data-testid='linkedOrgButton']//span[2]");

    By txtOrganisationName = By.id("organisation-lookup-label");

    By btnSelect= By.xpath("//button[@data-testid='create_organisation_subsidiarySubmit']");

    //###############################################ACTIONS#########################################################

    public void clickLnkLinkedOrgs() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(lnkLinkedOrgs).click();
    }

    public void clickBtnSubsidiaryOrganisation() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSubsidiaryOrganisation).click();
    }

    public void setTxtOrgnisationName(String organisationName) throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(txtOrganisationName).sendKeys(organisationName);
    }

    public void setBtnSelect() throws Exception{
        Thread.sleep(3000);
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        ldriver.findElement(btnSelect).click();
    }
}
