package Elements;

import org.openqa.selenium.By;

public class ProductDetailsElements {
    public By productTitle = By.cssSelector("h2[class='name']");
    public By productPrice = By.cssSelector("h3[class='price-container']");
    public By productDescription = By.id("myTabContent");
    public By productImage = By.id("imgp");
    public By addToCart = By.cssSelector("a[class='btn btn-success btn-lg']");
    public By cartButton = By.id("cartur");
}
