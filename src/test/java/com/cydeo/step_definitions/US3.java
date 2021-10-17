package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class US3 {


    @When("user select file module")
    public void user_select_file_module() {
        DashboardPage modules = new DashboardPage();
        modules.getFilesModule().click();
    }
    @Then("user verify that title is \"Files - Trycloud QA”")
    public void user_verify_that_title_is_files_trycloud() {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Files - Trycloud QA";
       assertEquals(expectedTitle,actualTitle);

       Driver.closeBrowser();
    }


    @And("user clicks on checkbox")
    public void userClicksOnCheckbox() {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//*[@id=\"headerSelection\"]/label"));
        checkBox.click();
    }

    @Then("user verify all files are selected")
    public void userVerifyAllFilesAreSelected() {
       List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//*[@class='selectCheckBox checkbox']"));

        for( WebElement eachCheckBox : allCheckBox){
            assertTrue(eachCheckBox.isSelected());
        }

        Driver.closeBrowser();

    }
}
