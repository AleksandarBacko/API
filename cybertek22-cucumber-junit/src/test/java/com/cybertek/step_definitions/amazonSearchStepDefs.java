package com.cybertek.step_definitions;

import com.cybertek.pages.amazonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.OfficeHoursUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonSearchStepDefs {
    amazonPage amazon;
    WebDriverWait wait;
    double singlePriceforHat;
    Select selectQuantity;
    double priceForTwo;

    @Given("User is on the Amazon Home Page")
    public void user_is_on_the_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon"));

    }
    @When("User search for hats for men")
    public void user_search_for_hats_for_men() {
        // Write code here that turns the phrase above into concrete actions
        amazon = new amazonPage();
        amazon.searchBox.sendKeys("hats for men"+ Keys.ENTER);

    }
    @When("User adds the first hat appearing to the cart with quantity two")
    public void user_adds_the_first_hat_appearing_to_the_cart_with_quantity_two() {
        // Write code here that turns the phrase above into concrete actions
        wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(amazon.firstHat));
        amazon.firstHat.click();
        // get the single price for the hat
        String priceText = amazon.price.getText();
        singlePriceforHat = OfficeHoursUtils.priceConverter(priceText);
        // Select the quatity as 2
        selectQuantity = new Select(amazon.quantityDropDown);
        selectQuantity.selectByVisibleText("2");
        // add to cart
        amazon.addToCart.click();
    }
    @Then("The total price and quantity should be correct")
    public void the_total_price_and_quantity_should_be_correct() {
        // Write code here that turns the phrase above into concrete actions
        amazon.cart.click();
        // assert that there are 2 items
        Assert.assertTrue(amazon.subTotalText.getText().contains("2 items"));
        // the price from the cart
        priceForTwo = Double.parseDouble(amazon.subTotalAmount.getText().substring(2));
        Assert.assertTrue(2*singlePriceforHat==priceForTwo);
    }
    @When("User reduce the quantity from two to one")
    public void user_reduce_the_quantity_from_two_to_one() {
        // Write code here that turns the phrase above into concrete actions
        selectQuantity.selectByVisibleText("1");
        BrowserUtils.sleep(2);
    }
    @Then("total price and quantity has been changed")
    public void total_price_and_quantity_has_been_changed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(amazon.subTotalText.getText().contains("1 item"));
        double priceForOne = Double.parseDouble(amazon.subTotalAmount.getText().substring(2));
        Assert.assertTrue(priceForTwo/priceForOne==2);
    }
}
