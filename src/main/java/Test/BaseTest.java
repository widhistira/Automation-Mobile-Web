package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    public static String urlLoginStg ="https://app-staging.meditap.id/login";

    @BeforeMethod
    public void openBrowser()throws InterruptedException{
        //Open Browser
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");

        //Open Link
        driver.set(new FirefoxDriver(options));
        driver.get().manage().window().maximize();
        driver.get().get(urlLoginStg);
        explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
