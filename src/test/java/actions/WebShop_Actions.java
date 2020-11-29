package actions;

import common.Common_Steps;
import elements.WebShop_Elements;
import org.openqa.selenium.WebDriver;

public class WebShop_Actions {

    private WebDriver driver;
    private WebShop_Elements webshop_elements;

    public WebShop_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        webshop_elements = new WebShop_Elements(driver);
    }

    public void clickOnBooksCategory(){
        webshop_elements.booksCategory.click();
    }

    public void addToCartFirstBook(){
        webshop_elements.addToCart.click();
    }

    public void clickOnTheShoppingCart(){
        webshop_elements.shoppingCart.click();
    }

    public void bookIsInTheCart(){
        webshop_elements.imageBook.isDisplayed();
    }

    public void addToCartFifthBook(){
        webshop_elements.fifthBook.click();
    }

    public void clickOnJewelryCategory(){
        webshop_elements.jewelryCategory.click();
    }

    public void addToCartSecondJewelry(){
        webshop_elements.secondJewelry.click();
    }

    public int getTheQuantityOfTheProduct(){
        return webshop_elements.cartItemRows.size();
    }








}
