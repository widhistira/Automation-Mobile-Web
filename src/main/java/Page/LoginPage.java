package Page;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);
    }

    @FindBy(xpath = "//input[@id='filled-basic']")
    WebElement colmEmailAddress;

    @FindBy(xpath = "//input[@id='filled-adornment-password']")
    WebElement colmPasswrd;

    @FindBy(css = ".MuiButton-root")
    WebElement btnLogin;


    public void inputEmail(String emailAdd){
        doSetText(colmEmailAddress,emailAdd);
    }

    public void inputPassword(String pswd){
        doSetText(colmPasswrd,pswd);
    }

    public void clickButtonLogin(){
        doClick(btnLogin);
    }
}
