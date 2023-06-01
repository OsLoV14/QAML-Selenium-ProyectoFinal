package Elements;

import org.openqa.selenium.By;

public class CartElements {

    public By productImage = By.cssSelector("tr[class='success']>td:nth-child(1)");
    public By productTitle = By.cssSelector("tr[class='success']>td:nth-child(2)");
    public By productPrice = By.cssSelector("tr[class='success']>td:nth-child(3)");
    public By deleteButton = By.cssSelector("tr[class='success']>td:nth-child(4)");
    public By totalPrice = By.cssSelector("div[class='col-lg-1']");
    public By placeOrderButton = By.cssSelector("button[class='btn btn-success']");
}
