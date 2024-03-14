package Page;

import Utility.Utility;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ClaimPage extends BasePage {
    public ClaimPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//div[@data-testid='btnClaim']")
    WebElement btnClaim;
    @FindBy(xpath = "//button[@data-testid='btnAddClaim']")
    WebElement btnAddclaim;

    @FindBy(xpath = "//input[@data-testid='colmnAdmissDate']")
    WebElement colmnAdmissDate;

//    public void clearDate(){
//        colmnAdmissDate.clear();
//    }
//    public void inputAdmissDate(String inputDate ) {
//        doSetText(colmnAdmissDate, inputDate);
//    }

    @FindBy(xpath = "//input[@data-testid='colmnDischargeDate']")
    WebElement colmnDischargeDate;

    //Drpdown member & select Member3
    @FindBy(xpath = "//div[@id='inpMemberName']")
    WebElement slctMember;

    public void clickListMember(){
        doClick(slctMember);}
    @FindBy(xpath = "//p[.='(01/12/2023 - 30/11/2024) - ZAI 1']")
    WebElement memberTestA;

    @FindBy(xpath = "//p[.='(01/01/2023 - 31/12/2023) - DUMMY TEST ANAK']")
    WebElement memberTestAnak;

    public enum Listmember{
        DUMMYTESTA,
        DUMMYTESTANAK,

    }

    public void pilihMember(ClaimPage.Listmember listmember)throws InterruptedException{
        switch (listmember){
            case DUMMYTESTA:
                doClick(memberTestA);
                break;
            case DUMMYTESTANAK:
                doClick(memberTestAnak);
                break;
        }
    }

    //dropdown Treatment & select treatment
    @FindBy(xpath = "//div[@id='inpTreatmentBenefit']")
    WebElement slctTreatment;

    // function dropdown treatment & select treatment
    public void clicktreatment() {
        doClick(slctTreatment);
    }

    @FindBy(css = "[data-value='OP']")
    WebElement treatmentOp;
    @FindBy(css = "[data-value='IP']")
    WebElement treatmentIp;
    @FindBy(css = "[data-value='DT']")
    WebElement treatmentDT;
    @FindBy(css = "[data-value='GL']")
    WebElement treatmentGl;

    // Click & select Provider
    @FindBy(id = "colmnHealthProviderName")
    WebElement colmHealthProvider;

    // Function Input HealthProvider
    public void inputHealthProvider(String rumahSakit) {
        doSetText(colmHealthProvider, rumahSakit);
    }

    public void enterHealtProvider() {
        colmHealthProvider.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = "//input[@data-testid='colmnTtlBillAmount']")
    WebElement colmBilllAmount;

    @FindBy(xpath = "//div[8]//textarea[1]")
    WebElement colmDiagnos;

    public void inputDiagnos(String diagnosa) {
        doSetText(colmDiagnos, diagnosa);
    }
    public void enterdiagnosa() {
        colmDiagnos.sendKeys(Keys.ENTER);
    }

    @FindBy(css = "[data-testid='colmnRemarks'] [rows='4']")
    WebElement colmRemark;

    public void inputRemark(String catatan) {
        doSetText(colmRemark, catatan);
    }

    public void enterRemark() {
        colmRemark.sendKeys(Keys.ENTER);
    }

    public void selecttreatment(ClaimPage.ListTreatment listTreatment) throws InterruptedException {
        switch (listTreatment) {
            case Inpatient:
                doClick(treatmentIp);
                break;
            case Outpatient:
                doClick(treatmentOp);
                break;
            case Dental:
                doClick(treatmentDT);
                break;
            case Glasess:
                doClick(treatmentGl);
                break;
        }

    }

    public enum ListTreatment {
        Inpatient,
        Outpatient,
        Dental,
        Glasess
    }
    @FindBy(xpath = "//button[@data-testid ='btnAddOriReceipt']")
    WebElement btnAddOriReceipt;
    @FindBy(xpath = "//button[@data-testid ='btnAddOriImage']")
    WebElement btnAddOriImage;
    @FindBy(xpath = "//button[@data-testid ='btnAddSupportDoc']")
    WebElement btnAddSupportDoc;
    @FindBy(css = ".PrivateSwitchBase-input")
    WebElement btnChekList;

    public void btnceklis() {
        doClick(btnChekList);
    }

    @FindBy(xpath = "//button[@data-testid ='btnSbmtClaim']")
    WebElement btnSubmitClaim;

    public void btnSubmit() {
        doClick(btnSubmitClaim);
    }

    @FindBy(css = ".text-primary.MuiButton-root" )
    WebElement btnContinueadd;

    public void btnContinueClaim(){
        doClick(btnContinueadd);
    }

    @FindBy(xpath = "//button[@data-testid ='btnClaimSucces']")
    WebElement btnClaimSucces;

    public void btnSubmitSucces() {
        doClick(btnClaimSucces);
    }
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3']")
    WebElement memberName;
    public void btnMemberName() {
        doClick(memberName);
    }
    @FindBy(xpath = "//li[@data-value='7903122300000001']")
    WebElement valueList;

    public void btnListMember() {
        doClick(valueList);
    }

    @FindBy(xpath = "//div[@class='flex flex-col']//div[1]/button[@class='MuiButtonBase-root MuiCardActionArea-root flex flex-col css-1m5f78l']")
    WebElement btnDetailMember;

    public void btnDetailMember() {
        doClick(btnDetailMember);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedSecondary MuiButton-sizeMedium MuiButton-outlinedSizeMedium w-full rounded-lg text-base py-2 css-11pdzw']")
    WebElement ViewDocument;

    public void btnViewDocument() {
        doClick(ViewDocument);
    }

    @FindBy(xpath = "//button[@class='text-white hover:text-white focus:outline-none']")
    WebElement backHome;

    public void btnBackHome() {
        doClick(backHome);
    }

    @FindBy(xpath = "//button[.='Pending']")
    WebElement pending;

    public void btnPending() {
        doClick(pending);
    }

    @FindBy(xpath = "//button[.='Closed']")
    WebElement closed;

    public void btnClosed() {
        doClick(closed);
    }
    @FindBy(xpath = "//button[.='Paid']")
    WebElement paid;

    public void btnPaid() {
        doClick(paid);
    }

    @FindBy(xpath = "//button[.='Rejected']")
    WebElement rejected;

    public void btnRejected() {
        doClick(rejected);
    }

    @FindBy(xpath = "//div[@class='MuiButtonBase-root MuiTabScrollButton-root MuiTabScrollButton-horizontal MuiTabs-scrollButtons MuiTabs-scrollButtonsHideMobile css-1q0ig8p']")
    WebElement slideRight;

    public void btnSlideRight() {
        doClick(slideRight);
    }

    @FindBy(xpath = "//button[.='On Process']")
    WebElement onProcess;

    public void btnOnProcess() {
        doClick(onProcess);
    }




    @FindBy(id = "alert-dialog-description")
    WebElement claimSubmission;

    public boolean txtClaimSubmissionVerifyAddClaim() {
        try {
            waitForElementPresent(claimSubmission);
            claimSubmission.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {

        }
        return false;
    }


    public void clickButtonClaim(){doClick(btnClaim);}

    public void clickAddClaim(){doClick(btnAddclaim);}

    //Input billamount
    public void inputBillAmount(String inpBillAmount){doSetText(colmBilllAmount, inpBillAmount);}
    










}
