package com.ultra.step_definitions;

import com.ultra.pages.Loginpage;
import com.ultra.pages.ProductPage;
import com.ultra.utilities.ConfigurationReader;
import com.ultra.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    Loginpage loginpage = new Loginpage();
    ProductPage productPage = new ProductPage();

    @Given("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters correct {string} and {string}")
    public void user_enters_correct_and(String username, String password) {
        loginpage.login(username, password);
    }
    @When("click on the login button")
    public void click_on_the_login_button() {
        loginpage.loginButton.click();
    }
    @Then("user can land on the products page")
    public void user_can_land_on_the_products_page() {
        Assert.assertTrue(productPage.title_product.getText().contains("Products"));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }

}
