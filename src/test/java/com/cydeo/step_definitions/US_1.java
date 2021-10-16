package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class US_1 {
    @Given("user on the login")
    public void userOnTheLogin() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "http://qa3.trycloud.net/index.php/login?clear=1";
        assertEquals(expectedUrl,actualUrl);
    }


    LoginPage login = new LoginPage();

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() {

        LoginPage login = new LoginPage();
        login.login(ConfigReader.read("username1"),ConfigReader.read("password"));
    }

    @And("user click login button")
    public void userClickLoginButton() {
        System.out.println("User clicked the button");
    }

    @Then("Verify user launched to the dashboard")
    public void verifyUserLaunchedToTheDashboard() {
       assertEquals("Dashboard - Trycloud QA", Driver.getDriver().getTitle());
    }

    @When("user enter invalid credentials")
    public void userEnterInvalidCredentials() {
        login.login("USER582","user85236" );
    }

    @And("click login button")
    public void clickLoginButton() {
        System.out.println("User clicked button");
    }

    @Then("“Wrong username or password.” message should be displayed")
    public void wrongUsernameOrPasswordMessageShouldBeDisplayed() {
        WebElement wrongCredentials = Driver.getDriver().findElement(By.cssSelector("#body-login > div.wrapper > div > main > div > div > form > fieldset > p.warning.wrongPasswordMsg"));
        assertTrue(wrongCredentials.isDisplayed());
    }



}
