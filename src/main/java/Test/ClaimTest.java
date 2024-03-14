package Test;

import Page.*;
import Utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClaimTest extends BaseTest{

    @Test(testName = "Add Claim Outpatient")
    public void ClaimMenu()throws InterruptedException{

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";
        String inpBillAmount = "100000";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);
        ClaimPage claimPage = new ClaimPage(driver,explicitWait);
        UploadPage upload = new UploadPage(driver,explicitWait);
        DetailClaimPage detail = new DetailClaimPage(driver,explicitWait);
        page.ScrollPage scrollPage = new page.ScrollPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(8000);

        //Klik button menu claim
        claimPage.clickButtonClaim();
        Thread.sleep(4000);

        // Klik add claim button
        claimPage.clickAddClaim();
        Thread.sleep(3000);
//        claimPage.clearDate();
//        Thread.sleep(2000);
//        claimPage.inputAdmissDate("11 januari 2024");
//        Thread.sleep(3000);
        //Select Member
        claimPage.clickListMember();
        Thread.sleep(3000);
        claimPage.pilihMember(ClaimPage.Listmember.DUMMYTESTA);
        Thread.sleep(2000);
        //Select Treatment
        claimPage.clicktreatment();
        claimPage.selecttreatment(ClaimPage.ListTreatment.Dental);
        Thread.sleep(1000);
        claimPage.inputHealthProvider("SILOAM HOSPITALS PALANGKA RAYA");
        Utility.hardWait(5);
        claimPage.enterHealtProvider();
        claimPage.inputBillAmount(inpBillAmount);
        claimPage.inputDiagnos("DEMAM");
        claimPage.enterdiagnosa();
        claimPage.inputDiagnos("MERIANG");
        Thread.sleep(1000);
        scrollPage.scrollDownByPixel();
        Thread.sleep(1000);
        claimPage.inputRemark("INI CUMA TESTING AUTOMATION");
        Thread.sleep(2000);
        //Uplaod document 1
        upload.clickAddDocReciept();
        Thread.sleep(1000);
        //Upload document 2
        upload.clicSupportDoc();
        Thread.sleep(1000);
        upload.clicSupportImage();
        Thread.sleep(1000);
        claimPage.btnceklis();
        claimPage.btnSubmit();
        Thread.sleep(3000);
        //Verify notif add claim
        Assert.assertTrue(claimPage.txtClaimSubmissionVerifyAddClaim());
        Thread.sleep(2000);
       //submit claim
        claimPage.btnContinueClaim();
        Thread.sleep(3000);
        claimPage.btnSubmitSucces();
        Thread.sleep(3000);

        //Click claim yang sudah di buat untuk cek detail
        claimPage.btnMemberName();
        Thread.sleep(1000);
        claimPage.btnListMember();
        Thread.sleep(2000);
        claimPage.btnPending();
        Thread.sleep(1000);
        claimPage.btnClosed();
        Thread.sleep(1000);
        claimPage.btnPaid();
        Thread.sleep(1000);
        claimPage.btnRejected();
        Thread.sleep(1000);
        claimPage.btnSlideRight();
        Thread.sleep(1000);
        claimPage.btnOnProcess();
        Thread.sleep(1000);
        claimPage.btnDetailMember();
        Thread.sleep(5000);
        scrollPage.scrollDownByPixel();
        Thread.sleep(2000);
        claimPage.btnViewDocument();
        Thread.sleep(3000);
        scrollPage.scrollUpByPixel();
        Thread.sleep(2000);
        claimPage.btnBackHome();
        Thread.sleep(2000);
        claimPage.btnBackHome();
        Thread.sleep(2000);
        detail.btnDetail();
        Thread.sleep(3000);
        //Verify Data Detail claim

    }

}
