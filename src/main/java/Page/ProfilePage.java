package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{
    public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//a[@data-testid='btnProfile']")
    WebElement btnbtnProfile;

    public void clickProfile(){
        doClick(btnbtnProfile);
    }

    @FindBy(xpath = "//div[@data-testid='btnProfileDetail']")
    WebElement ProfileDetail;

    public void clickProfileDetail(){
        doClick(ProfileDetail);
    }

    @FindBy(xpath = "//button[.='Bank Account']")
    WebElement btnBankAccount;

    public void clickBankAccount() {
        doClick(btnBankAccount);
    }

    @FindBy(xpath = "//button[.='Family Information']")
    WebElement btnFamilyInformation;

    public void clickFamilyInformation() {
        doClick(btnFamilyInformation);
    }

    @FindBy(xpath = "//button[.='General Information']")
    WebElement btnGeneralInformation;

    public void clickButtonAccordian() { doClick(btnAccordian1);}

    @FindBy(xpath = "//div[@id='panela-header1']")
    WebElement btnAccordian1;

    public void clickButtonAccordian2() { doClick(btnAccordian2);}

    @FindBy(xpath = "//div[@id='panela-header2']")
    WebElement btnAccordian2;
    public void clickButtonAccordian3() { doClick(btnAccordian3);}

    @FindBy(xpath = "//div[@id='panela-header3']")
    WebElement btnAccordian3;


    public void clickGeneralInformation() {
        doClick(btnGeneralInformation);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void clickFAQ() {
        doClick(FAQ);
    }
    @FindBy(xpath = "//div[@data-testid='BtnFAQ']")
    WebElement FAQ;

    @FindBy(xpath = "//input[@id='filled-adornment-password']")
    WebElement inputTopic;
    public void colmTopic(String rumahSakit) {
        doSetText(inputTopic, rumahSakit);
    }
    public void enterSearch() {
        inputTopic.sendKeys(Keys.ENTER);
    }


    public void btnBackHome() {

        doClick(backHome);
    }
    @FindBy(xpath = "//div[@data-testid='btnChngPass']")
    WebElement btnChangePassword;

    public void clickChangePassword() {
        doClick(btnChangePassword);
    }
    @FindBy(xpath = "//input[@id='filled-adornment-old-password']")
    WebElement inputOldPass;
    public void inputOldPassword(String testingMeditap) {
        doSetText(inputOldPass, testingMeditap);
    }

    @FindBy(xpath = "//input[@id='filled-adornment-password']")
    WebElement clickNewPassword;

    public void inputNewPassword(String testAjah) {
        doSetText(clickNewPassword, testAjah);
    }

    @FindBy(xpath = "//input[@id='filled-adornment-confirm-password']")
    WebElement clickConfirmNewPassword;

    public void inputNewConfirmPassword(String testAjah) {
        doSetText(clickConfirmNewPassword, testAjah);
    }

    @FindBy(xpath = "//div[@class='flex flex-row justify-center']")
    WebElement clickConfirm;

    public void buttonConfirm() {
        doClick(clickConfirm);
    }

    @FindBy(xpath = "//div[@class='flex items-center cursor-pointer']")
    WebElement readAllDocument;
    public void clickReadAllDocument() {
        doClick(readAllDocument);
    }
}
