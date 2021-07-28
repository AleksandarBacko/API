package com.demoblaze.step_definitions;

import com.demoblaze.pages.CategoryPage;
import com.demoblaze.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class verefyCategoryOptionsStepDefs {

    CategoryPage categoryPage=new CategoryPage();


    @When("User clicks on {string} category")
    public void user_clicks_on_category(String string) {
        BrowserUtils.sleep(3);
    categoryPage.dinString("Phones").click();

    BrowserUtils.sleep(2);
    }


    @And("User should see in {string}")
    public void userShouldSeeIn(String arg0) {
    }

    @Then("user should see{string}")
    public void userShouldSee(String arg0) {
        BrowserUtils.sleep(2);
        for (String each:categoryPage.getElementsText(categoryPage.devices)
             ) {
            System.out.println(each);
            System.out.println(arg0);
            System.out.println();

//            BrowserUtils.sleep(5);
//            Assert.assertTrue("mess faill",each.contains(arg0));
//            BrowserUtils.sleep(5);
        }
    }
}
