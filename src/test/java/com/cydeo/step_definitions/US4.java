package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class US4 {

    @When("user clicks action button")
    public void user_clicks_action_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement actionButon = Driver.getDriver().findElement(By.xpath("//*[@id='fileList']/tr[@data-id='1617']/td//span[@class='fileactions']/a[@data-action='menu']"));
        actionButon.click();

    }
    @When("user clicks add to favorites button")
    public void user_clicks_add_to_favorites_button() {
        WebElement addToFavoriteBut =  Driver.getDriver().findElement(By.xpath("//*[@id='fileList']//tr[@data-id='1617']//li/a[@data-action='Favorite']"));
        addToFavoriteBut.click();
        BrowserUtil.waitFor(2);

    }
    @When("user clicks on Favorites from side bar")
    public void user_clicks_on_favorites_from_side_bar() {
       WebElement favoritesSideBar = Driver.getDriver().findElement(By.linkText("Favorites"));
       favoritesSideBar.click();

    }
    @Then("user verify there is selected file")
    public void user_verify_there_is_selected_file() {

        BrowserUtil.waitFor(2);
        Driver.getDriver().navigate().to("http://qa3.trycloud.net/index.php/apps/files/?dir=/&view=favorites");

        WebElement file = Driver.getDriver().findElement(By.xpath("//tbody[@id='fileList']/tr[@data-id='1617']"));
        assertTrue(file.isDisplayed());
        System.out.println("file.isDisplayed() = " + file.isDisplayed());

        Driver.closeBrowser();
    }

}
