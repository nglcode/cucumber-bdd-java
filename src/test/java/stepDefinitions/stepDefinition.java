package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Bg - Validate browser");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Bg - Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Bg - Browser started");
    }
	
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Navigated to login URL");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in successfully");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String username, String password) throws Throwable {
    	System.out.println("Logged in successfully with " + username + " and " + password);
    }

    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated home page");
    }
    

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String value) throws Throwable {
    	System.out.println("Cards displayed " + value);
    }
    
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj  = data.asLists();
    	String name = obj.get(0).get(0);
    	String password = obj.get(0).get(1);
    	System.out.println("User sign up with following details...[" + name + " - " + password + "]");
    }
    
    
    @When("^User login into application using examples with username (.+) and password (.+)$")
    public void user_login_into_application_using_examples_with_username_and_password(String username, String password) throws Throwable {
    	System.out.println("Login with Examples: " + username + " - " + password);
    }
}
