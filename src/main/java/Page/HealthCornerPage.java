package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthCornerPage extends BasePage{
    public HealthCornerPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    @FindBy(xpath = "//a[@href='/health-corner']/h5[@class='text-primary-30 font-lato font-bold text-[12px] mt-4 mb-1']")
    WebElement healthCorner;

    public void clickhealthCorner(){
        doClick(healthCorner);
    }

    @FindBy(xpath = "//div[.='Pemberitahuan Pemeliharaan Sistem Meditap tanggal 23 Januari 2024']")
    WebElement detailInfoHealth;

    public void clickdetailInfoHealth() {
        doClick(detailInfoHealth);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {

        doClick(backHome);
    }
}
