package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BenefitHandbookPage extends BasePage{
    public BenefitHandbookPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//div[@data-testid='btnBenefits']")
    WebElement benefit;

    public void clickbenefit(){
        doClick(benefit);
    }

    @FindBy(xpath = "//button[@data-testid='btnTabInpatient']")
    WebElement tabInpatient;

    public void btnTabInpatient() {
        doClick(tabInpatient);
    }

    @FindBy (xpath = "//span[.='Biaya Kamar dan Menginap di Rumah Sakit, Maksimal per hari']")
    WebElement benefit1;
    public String getBenefit1() { return
        doGetText(benefit1);
    }

    @FindBy(xpath = "//button[@data-testid='btnTabOutpatient']")
    WebElement tabOutpatient;

    public void btnTabOutpatient() {
        doClick(tabOutpatient);
    }
    @FindBy(xpath = "//button[@data-testid='btnTabDental']")
    WebElement tabDental;

    public void btnTabDental() {
        doClick(tabDental);
    }
    @FindBy(xpath = "//button[@data-testid='btnTabGlasses']")
    WebElement tabGlasses;

    public void btnTabGlasses() {
        doClick(tabGlasses);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {

        doClick(backHome);
    }

// Handbook Detail
    @FindBy(xpath = "//div[@data-testid='btnHandbook']")
    WebElement handbook;
    public void btnHandbook() {
        doClick(handbook);
    }
    @FindBy(xpath = "//button[@data-testid='btnTabGeneral']")
    WebElement tabGeneral;

    public void btnTabGeneral() {
        doClick(tabGeneral);
    }

    @FindBy(xpath = "//button[@data-testid='btnTabBenefit']")
    WebElement tabBenefit;

    public void btnTabBenefit() {
        doClick(tabBenefit);
    }
    @FindBy(xpath = "//button[@data-testid='btnTabExclusion']")
    WebElement tabExclusion;

    public void btnTabExclusion() {
        doClick(tabExclusion);
    }
    @FindBy(xpath = "//button[@data-testid='btnTabHelpSection']")
    WebElement tabHelpSection;

    public void btnTabHelpSection() {
        doClick(tabHelpSection);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement btnbackHome;

    public void BackHome() {

        doClick(btnbackHome);
    }

}
