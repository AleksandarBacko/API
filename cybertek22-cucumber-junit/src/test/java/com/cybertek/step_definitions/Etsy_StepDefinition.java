package com.cybertek.step_definitions;

import com.cybertek.pages.etsyPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinition {
    etsyPage obj =new etsyPage();
    @Given("user is on Etsy landing page")
    public void user_is_on_etsy_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Etsy"));

    }
    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expected="Etsy";
        String actual=Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));
    }


    @When("user types Wooden Spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {

        obj.searchEtsy.sendKeys("Wooden Spoon");
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        obj.searchButton.click();

    }
    @Then("user sees title is Wooden spoon | Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
