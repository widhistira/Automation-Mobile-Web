package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPage extends BasePage{
    public NotificationPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//div[@data-testid='btnNotification']")
    WebElement btnNotification;

    public void clickNotification(){
        doClick(btnNotification);
    }

    @FindBy(xpath = "//div[@class='flex-grow flex flex-col rounded-t-2xl bg-white border-0 overflow-hidden']/button[2]")
    WebElement detailNotif;

    public void clickdetailNotif() {
        doClick(detailNotif);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium w-full rounded-lg text-base py-2 css-11pdzw']")
    WebElement viewDocument;

    public void clickViewDocument() {
        doClick(viewDocument);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {

        doClick(backHome);
    }

    @FindBy(xpath = "//div[@class='flex items-center cursor-pointer']")
    WebElement readAllDocument;
    public void clickReadAllDocument() {
        doClick(readAllDocument);
    }
}
