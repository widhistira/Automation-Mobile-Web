package Test;

import Page.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BenefitHandbookTest extends BaseTest{

    @Test(testName = "Member Claim")
    public void benefitHandbookMenu()throws InterruptedException{

        String emailAdd = "qadummytest01@mail.co.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        BenefitHandbookPage benefitHandbookPage = new BenefitHandbookPage(driver,explicitWait);
        page.ScrollPage scrollPage = new page.ScrollPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(6000);

        //click member card
        benefitHandbookPage.clickbenefit();
        Thread.sleep(3000);
        benefitHandbookPage.btnTabInpatient();
        Thread.sleep(2000);
        Assert.assertEquals(benefitHandbookPage.getBenefit1(),"Biaya Kamar dan Menginap di Rumah Sakit, Maksimal per hari");
//        scrollPage.scrollDownByPixel();
//        Thread.sleep(2000);
//        scrollPage.scrollUpByPixel();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabOutpatient();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabDental();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabGlasses();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnBackHome();
//        Thread.sleep(3000);

//        Handbook////////////////////////
//        benefitHandbookPage.btnHandbook();
//        Thread.sleep(3000);
//        benefitHandbookPage.btnTabGeneral();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabBenefit();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabExclusion();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnTabHelpSection();
//        Thread.sleep(2000);
//        benefitHandbookPage.btnBackHome();
//        Thread.sleep(3000);
    }

    @AfterMethod
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(3000);
        driver.get().quit();
    }

}
