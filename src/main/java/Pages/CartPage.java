package Pages;

import Elements.CartElements;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    protected CartElements byElements = new CartElements();

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPagePresent() {
        try {
            getFluentWait(60, 5).until(ExpectedConditions.visibilityOfElementLocated(byElements.productTitle));
            return true;
        }
        catch (TimeoutException e) {
            return false;
        }
    }

    public boolean validateImage() {
        return driver.findElement(byElements.productImage).isDisplayed();
    }

    public boolean validateTitle() {
        String title = driver.findElement(byElements.productTitle).getText();
        System.out.println(title);
        return driver.findElement(byElements.productTitle).isDisplayed();
    }

    public boolean validatePrice() {
        String price = driver.findElement(byElements.productPrice).getText();
        System.out.println(price);
        return driver.findElement(byElements.productPrice).isDisplayed();
    }

    public boolean validateDeleteLink() {
        String deleteLink = driver.findElement(byElements.deleteButton).getText();
        System.out.println(deleteLink);
        return driver.findElement(byElements.deleteButton).isDisplayed();
    }

    public boolean validateTotalPrice() {
        String totalPrice = driver.findElement(byElements.totalPrice).getText();
        System.out.println(totalPrice);
        return driver.findElement(byElements.totalPrice).isDisplayed();
    }

    public void placeOrderButton() {
        driver.findElement(byElements.placeOrderButton).click();
    }
}
