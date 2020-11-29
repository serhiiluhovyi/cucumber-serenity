package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebShop_Elements {

    private WebDriver driver;

    @FindBy(linkText = "Books")
    public WebElement booksCategory;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
    public WebElement addToCart;

    @FindBy(linkText = "Shopping cart")
    public WebElement shoppingCart;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/img[1]")
    public WebElement imageBook;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/div[3]/div[2]/input")
    public WebElement fifthBook;

    @FindBy(linkText = "Jewelry")
    public WebElement jewelryCategory;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
    public WebElement secondJewelry;

    @FindBy(className = "cart-item-row")
    public List<WebElement> cartItemRows;

    public WebShop_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
