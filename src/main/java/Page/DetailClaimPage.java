package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailClaimPage extends BasePage{
    public DetailClaimPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }

    //Untuk cek Detail claim dan selalu ambil di paling atas
    @FindBy(css = "[fdprocessedid='q5bbws']")
    WebElement btnDetail1;

    public void btnDetail(){
        doClick(btnDetail1);
    }
}
