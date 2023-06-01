package Pages;

import Elements.LandingElements;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {

    protected LandingElements byElements = new LandingElements();

    public LandingPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoblaze.com/");
    }

    public boolean isPagePresent() {
        try {
            getFluentWait(60, 5).until(ExpectedConditions.visibilityOfElementLocated(byElements.navigationBar));
            return true;
        }
        catch (TimeoutException e) {
            return false;
        }
    }

    public void selectElementSamsungGalaxyS6() {
        driver.findElement(byElements.samsungGalaxyS6).click();
    }
}
