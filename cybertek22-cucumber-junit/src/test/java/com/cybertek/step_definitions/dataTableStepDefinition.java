package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class dataTableStepDefinition {
    LibraryLoginPage loginPage=new LibraryLoginPage();
    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }

    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String,String> loginInfo) {
       loginPage.emailInput.sendKeys(loginInfo.get("username"));
       loginPage.passwordInput.sendKeys(loginInfo.get("password"));
       loginPage.signIn.click();
    }
    @Then("user should see title is something")
    public void user_should_see_title_is_something() {
        String expectedTitle="Library";
        BrowserUtils.sleep(5);
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dropUrl"));
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {

        Select sec=new Select(loginPage.month);
        List<WebElement> actual=sec.getOptions();
        for (int i = 0; i <months.size() ; i++) {
            Assert.assertEquals(months.get(i),actual.get(i).getText());

        }


    }


}
