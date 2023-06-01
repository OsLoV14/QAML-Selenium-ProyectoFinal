package Pages;

import Elements.ProductDetailsElements;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage extends BasePage {

    protected ProductDetailsElements byElements = new ProductDetailsElements();

    public ProductDetailsPage(WebDriver driver) {
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

    public boolean validateProductTitle() {
        return driver.findElement(byElements.productTitle).isDisplayed();
    }

    public boolean validateProductPrice() {
        return driver.findElement(byElements.productPrice).isDisplayed();
    }

    public boolean validateProductDescription() {
        return driver.findElement(byElements.productDescription).isDisplayed();
    }

    public boolean validateProductImage() {
        return driver.findElement(byElements.productImage).isDisplayed();
    }

    public boolean validateAddToCart() {
        return driver.findElement(byElements.addToCart).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(byElements.addToCart).click();
    }

    public void manageWindow() {
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    public void clickCartButton() {
        driver.findElement(byElements.cartButton).click();
    }
}
