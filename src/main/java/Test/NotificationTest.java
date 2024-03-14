package Test;

import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NotificationTest extends BaseTest{

    @Test(testName = "Notification")
    public void NotificationMenu()throws InterruptedException{

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        NotificationPage NotificationPage = new NotificationPage(driver,explicitWait);
        page.ScrollPage scrollPage = new page.ScrollPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //click member card
        NotificationPage.clickNotification();
        Thread.sleep(3000);
        NotificationPage.clickdetailNotif();
        Thread.sleep(3000);
        scrollPage.scrollDownByPixel();
        Thread.sleep(2000);
        NotificationPage.clickViewDocument();
        Thread.sleep(2000);
        scrollPage.scrollUpByPixel();
        Thread.sleep(2000);
        NotificationPage.btnBackHome();
        Thread.sleep(3000);
        NotificationPage.clickReadAllDocument();
        Thread.sleep(3000);
        NotificationPage.btnBackHome();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
