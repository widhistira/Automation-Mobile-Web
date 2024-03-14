package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthPage extends BasePage{
    public HealthPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//div[@data-testid='btnHealthProvider']")
    WebElement healthProvider;

    public void btnHealthProvider(){
        doClick(healthProvider);
    }

    @FindBy(xpath = "//input[@data-testid='inptSrchProvider']")
    WebElement srchProvider;
    public void inptSrchProvider(String klinik) {
        doSetText(srchProvider, klinik);
    }

    public void enterProvider() {
        srchProvider.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//button[contains(.,'KLINIK KIMIA FARMA NUSADUAClinic0813-1116-0750- | ,')]")
    WebElement detailProvider;
    public void clickProvider() {
        doClick(detailProvider);
    }
    @FindBy(xpath = "//button[@data-testid='btnSortBy']")
    WebElement sortBy;

    public void btnSortBy(){
        doClick(sortBy);
    }
    @FindBy(xpath = "//div[@data-testid='divAToZ']")
    WebElement divAToZ;

    public void btndivAToZ(){
        doClick(divAToZ);
    }
    @FindBy(xpath = "//div[@data-testid='divZToA']")
    WebElement divZToA;

    public void btndivZToA(){
        doClick(divZToA);
    }
//type
    @FindBy(xpath = "//button[@data-testid='btnFltrType']")
    WebElement fltrType;

    public void btnFltrType(){
        doClick(fltrType);
    }
    @FindBy(xpath = "//div[@data-testid='btnClinic']")
    WebElement clinic;

    public void btnClinic(){
        doClick(clinic);
    }
    @FindBy(xpath = "//div[@data-testid='btnLaboratory']")
    WebElement laboratory;

    public void btnLaboratory(){
        doClick(laboratory);
    }

    @FindBy(xpath = "//div[@data-testid='btnOptic']")
    WebElement optic;

    public void btnOptic(){
        doClick(optic);
    }
    @FindBy(xpath = "//div[@data-testid='btnHospital']")
    WebElement hospital;

    public void btnHospital(){
        doClick(hospital);
    }
    @FindBy(xpath = "//button[@data-testid='btnFilter']")
    WebElement filter;

    public void btnFilter(){
        doClick(filter);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {

        doClick(backHome);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium w-full rounded-lg text-white normal-case css-1hw9j7s']")
    WebElement filterType;

    public void btnFilterType() {

        doClick(filterType);
    }


}
