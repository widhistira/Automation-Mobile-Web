package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MemberClaimPage extends BasePage{
    public MemberClaimPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//div[@data-testid='btnMemberCard']")
    WebElement memberClaim;

    public void clickMemberClaim(){
        doClick(memberClaim);
    }

    @FindBy(xpath = "//button[@data-testid='btnCopyCardNumber']")
    WebElement cardNumber;

    public void clickCopyCardNumber() {
        doClick(cardNumber);
    }

    @FindBy(xpath = "//button[@data-testid='btnDwnldMemberCard']")
    WebElement downloadCard;

    public void clickDownloadCard() {
        doClick(downloadCard);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {

        doClick(backHome);
    }

    @FindBy(xpath = "//div[@data-testid='btnInfoDetail']")
    WebElement infoDetail;
    public void clickInfoDetail() {
        doClick(infoDetail);
    }
}
