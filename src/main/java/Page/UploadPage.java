package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadPage extends BasePage{
    public UploadPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);

    }
    String pathFileUploadOriLocal = System.getProperty("user.dir") + "\\data\\automationdocument2.pdf";
    String pathFileUploadSupportLocal = System.getProperty("user.dir") + "\\data\\DocumentAutomation.pdf";
    String pathFileUploadSupportImg = System.getProperty("user.dir") + "\\data\\tidus.jpg";

    //klik button add document
    @FindBy(id = "contained-button-file")
    WebElement docOrigin;

    public void clickAddDocReciept(){
        docOrigin.sendKeys(pathFileUploadOriLocal);
    }

@FindBy(id = "supporting-document-file")
    WebElement docSup;

    public void clicSupportDoc(){
        docSup.sendKeys(pathFileUploadSupportLocal);

    }

    @FindBy(id = "contained-button-image")
    WebElement imageSup;

    public void clicSupportImage(){
        imageSup.sendKeys(pathFileUploadSupportImg);

    }

    //upload doc origin img
//    @FindBy(id = "contained-button-image")
//    WebElement docOriginimg;
//    public void clicAddDocReciepntImg(){
//        docOriginimg.sendKeys("C:\\Users\\RyanIndianto\\mobileweb\\data\\FileImage.jpg");
//    }

    }

