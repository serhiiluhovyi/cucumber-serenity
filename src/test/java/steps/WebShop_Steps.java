package steps;

import actions.EbayHome_Actions;
import actions.WebShop_Actions;
import common.Common_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class WebShop_Steps {

    private Common_Actions common_actions;
    private WebShop_Actions webshop_actions;

    public WebShop_Steps(Common_Actions common_actions, WebShop_Actions webshop_actions) {
        this.common_actions = common_actions;
        this.webshop_actions = webshop_actions;
    }

    @Given("I open Web Shop homepage")
    public void iOpenWebShopHomepage() {
        common_actions.goToUrl("http://demowebshop.tricentis.com/");
    }

    @And("I click on Books Category")
    public void iClickOnBooksCategory() {
        webshop_actions.clickOnBooksCategory();

    }

    @When("I add to cart the first book")
    public void iAddToCartTheFirstBook() throws InterruptedException {
        webshop_actions.addToCartFirstBook();
        Thread.sleep(1000);

    }

    @Then("I click on the shopping cart")
    public void iClickOnTheShoppingCart() throws InterruptedException {
        webshop_actions.clickOnTheShoppingCart();
        Thread.sleep(1000);

    }

    @And("I check that book is in the cart")
    public void iCheckThatBookIsInTheCart() throws InterruptedException {
        webshop_actions.bookIsInTheCart();
        Thread.sleep(1000);


    }

    @When("I add to cart the fifth book")
    public void iAddToCartTheFifthBook() {
        webshop_actions.addToCartFifthBook();

    }

    @And("I click on Jewelry Category")
    public void iClickOnJewelryCategory() {
        webshop_actions.clickOnJewelryCategory();
    }

    @And("I add to cart the second jewelry")
    public void iAddToCartTheSecondJewelry() {
        webshop_actions.addToCartSecondJewelry();

    }

    @And("I check the quantity {int} of the product")
    public void iCheckTheQuantityOfTheProduct(int count) {
        int actualCount = webshop_actions.getTheQuantityOfTheProduct();

        if (actualCount !=count) {
            fail("Incorrect quantity" + count + " results shown");
        }

    }
}
