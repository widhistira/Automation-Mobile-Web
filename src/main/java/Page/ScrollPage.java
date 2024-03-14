package page;

import Page.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollPage extends BasePage {


    public ScrollPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    public void runJavaScriptCommand(String script) {
        JavascriptExecutor js = (JavascriptExecutor) driver.get();
        js.executeScript(script);
    }

    public void scrollDownByPixel(){
        runJavaScriptCommand("window.scrollBy(0,800)");
    }


    public void scrollUpByPixel(){
        runJavaScriptCommand("window.scrollBy(0,-800)");
    }



}
