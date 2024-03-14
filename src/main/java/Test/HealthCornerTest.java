package Test;

import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HealthCornerTest extends BaseTest{

    @Test(testName = "Health Corner")
    public void healthMenu()throws InterruptedException{

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        HealthCornerPage HealthCornerPage = new HealthCornerPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //click member card
        HealthCornerPage.clickhealthCorner();
        Thread.sleep(3000);
        HealthCornerPage.clickdetailInfoHealth();
        Thread.sleep(2000);
        HealthCornerPage.btnBackHome();
        Thread.sleep(2000);
        HealthCornerPage.btnBackHome();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
