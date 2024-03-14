package Test;

import Page.*;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{

    @Test(testName = "Profile")
    public void ProfileMenu()throws InterruptedException{

        String emailAdd = "qadummytest01@mail.co.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        ProfilePage ProfilePage = new ProfilePage(driver,explicitWait);
        page.ScrollPage scrollPage = new page.ScrollPage(driver,explicitWait);
        UploadPage upload = new UploadPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //click member card
        ProfilePage.clickProfile();
        Thread.sleep(3000);
        ProfilePage.clickProfileDetail();
        Thread.sleep(3000);
        ProfilePage.clickBankAccount();
        Thread.sleep(3000);
        ProfilePage.clickFamilyInformation();
        Thread.sleep(2000);
        ProfilePage.clickButtonAccordian();
        Thread.sleep(2000);
        ProfilePage.clickButtonAccordian2();
        Thread.sleep(2000);
        ProfilePage.clickButtonAccordian3();
        Thread.sleep(2000);
        ProfilePage.clickGeneralInformation();
        Thread.sleep(2000);
        ProfilePage.btnBackHome();
        Thread.sleep(3000);
//        ProfilePage.clickReadAllDocument();
//        Thread.sleep(3000);
//        ProfilePage.btnBackHome();
        Thread.sleep(3000);
        ProfilePage.clickFAQ();
        Thread.sleep(2000);
        ProfilePage.colmTopic("rumah sakit");
        Thread.sleep(2000);
        ProfilePage.enterSearch();
        Thread.sleep(2000);
        ProfilePage.btnBackHome();
        Thread.sleep(3000);
        ProfilePage.clickChangePassword();
        Thread.sleep(2000);
        ProfilePage.inputOldPassword("TestingMeditap");
        Thread.sleep(3000);
        ProfilePage.inputNewPassword("testAjah");
        Thread.sleep(3000);
        ProfilePage.inputNewConfirmPassword("testAjah");
        Thread.sleep(3000);
        ProfilePage.buttonConfirm();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
