package Test;

import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MemberTest extends BaseTest{

    @Test(testName = "Member Claim")
    public void MemberMenu()throws InterruptedException{

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        MemberClaimPage MemberClaimPage = new MemberClaimPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //click member card
        MemberClaimPage.clickMemberClaim();
        Thread.sleep(3000);
        MemberClaimPage.clickCopyCardNumber();
        Thread.sleep(2000);
        MemberClaimPage.clickDownloadCard();
        Thread.sleep(2000);
        MemberClaimPage.btnBackHome();
        Thread.sleep(5000);
        MemberClaimPage.clickInfoDetail();
        Thread.sleep(2000);
        MemberClaimPage.btnBackHome();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
