package com.cybertek.step_definitions.nextBaseCrm;

import com.cybertek.pages.nextBasePage.nextBaseLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class nextBaseStepDefs {
    nextBaseLoginPage nextBaseLoginPage=new nextBaseLoginPage();
    @Given("User is on nextBasecrm Login page")
    public void user_is_on_next_basecrm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseLoginPage"));
    }
    @When("User enter correct email")
    public void user_enter_correct_email() {
        nextBaseLoginPage.usernameNB.sendKeys(ConfigurationReader.getProperty("nextBaseLoginUsername"));
    }
    @When("User enter correct password")
    public void user_enter_correct_password() {
        nextBaseLoginPage.passwordNB.sendKeys(ConfigurationReader.getProperty("nextBaseLoginPassword"));
    }
    @When("User click on {string} button")
    public void user_click_on_button(String string) {
       nextBaseLoginPage.LogInButtonNB.click();
    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        String expectedTitle="Portal";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
