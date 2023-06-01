import Pages.LandingPage;
import Utilities.DriverSetup;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    DriverSetup driver;

    private LandingPage landingPage;

    @BeforeSuite
    public void initTest() {
        driver = new DriverSetup();
        landingPage = new LandingPage(driver.getWebDriver());
    }

    @AfterSuite
    public void endTest() {
        landingPage.end();
    }
}
