package Test;

import Page.DashboardPage;
import Page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(testName = "Login mobile web")
    public void loginMobileWeb(){

        String emailAdd = "dummyZAI1@meditap.id";
        String pswd = "TestingMeditap";

        LoginPage loginPage = new LoginPage(driver,explicitWait);
        DashboardPage dashboardPage = new DashboardPage(driver,explicitWait);

        loginPage.inputEmail(emailAdd);
        loginPage.inputPassword(pswd);
        loginPage.clickButtonLogin();

    }
}
