package Test;

import Page.*;
import Utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HealthTest extends BaseTest{

    @Test(testName = "Member Claim")
    public void healthMenu()throws InterruptedException{

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        HealthPage healthPage = new HealthPage(driver,explicitWait);
        page.ScrollPage scrollPage = new page.ScrollPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //click health provider
        healthPage.btnHealthProvider();
        Thread.sleep(2000);
        healthPage.inptSrchProvider("KLINIK");
        Utility.hardWait(5);
        healthPage.enterProvider();
        Thread.sleep(1000);
        scrollPage.scrollDownByPixel();
        Thread.sleep(2000);
        scrollPage.scrollUpByPixel();
        Thread.sleep(2000);
        healthPage.clickProvider();
        Thread.sleep(2000);
        healthPage.btnBackHome();
        Thread.sleep(2000);
//        sortby
        healthPage.btnSortBy();
        Thread.sleep(2000);
        healthPage.btndivAToZ();
        Thread.sleep(2000);
        healthPage.btndivZToA();
        Thread.sleep(2000);
        healthPage.btnFilter();
        Thread.sleep(3000);
//        type
        healthPage.btnFltrType();
        Thread.sleep(2000);
        healthPage.btnClinic();
        Thread.sleep(2000);
        healthPage.btnLaboratory();
        Thread.sleep(2000);
        healthPage.btnOptic();
        Thread.sleep(2000);
        healthPage.btnHospital();
        Thread.sleep(2000);
        healthPage.btnFilterType();
        Thread.sleep(2000);
        healthPage.btnBackHome();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
