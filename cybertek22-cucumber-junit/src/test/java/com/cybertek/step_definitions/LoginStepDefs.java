package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on login page");

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user sees the dashboard");

    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
    }
}
