package com.zerobank.stepDefinitions;

import com.zerobank.pages.login_page;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class login_stepdefinition {
    login_page page=new login_page();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        page.signinButton.click();
    }
    @Then("the user enters credentials and logs in")
    public void the_user_enters_credentials_and_logs_in() {
        page.logsIn();

    }

}
