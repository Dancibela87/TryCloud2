package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.SearchFiles;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class US14 {
    SearchFiles search = new SearchFiles();

    @Given("user is at the dashboard page")
    public void userIsAtTheDashboardPage() {

        LoginPage login = new LoginPage();
        login.goTo();
        login.login(ConfigReader.read("username1"),ConfigReader.read("password"));
    }

    @And("user clicks on magnifier icon")
    public void userClicksOnMagnifierIcon() {

        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        search.getSearchBtn().click();

    }

    @And("user searches files")
    public void userSearchesFiles() {
        search.getInputBox().sendKeys("Talk");
    }

    @Then("user Will varify that file is visible")
    public void userWillVarifyThatFileIsVisible() {

        WebElement file = Driver.getDriver().findElement(By.xpath("//*[@id=\"header-menu-unified-search\"]/div[2]/ul[2]/li[1]/a/span/h3"));
        assertTrue(file.isDisplayed());

        Driver.closeBrowser();
    }
}
