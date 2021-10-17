package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class US2 {
    @Then("user verify modules")
    public void user_verify_modules(List<String> modules) {
        DashboardPage modules2 = new DashboardPage();
        List<WebElement> actualModules = new ArrayList<>();
        actualModules.addAll(Arrays.asList(modules2.getDashboardModule(), modules2.getFilesModule(),
                modules2.getPhotoesModule(), modules2.getActivityModule(), modules2.getTalkModule(), modules2.getMailModule(),
                modules2.getContactsModule(), modules2.getCircleModule(), modules2.getCalendarModule(), modules2.getDeckModule()));

        List<String> allText = new ArrayList<>();
        Actions actions = new Actions(Driver.getDriver());

        for( WebElement each : actualModules){
            actions.moveToElement(each).perform();
            allText.add(each.getText());
            BrowserUtil.waitFor(2);
        }
        System.out.println("modules = " + modules);

        assertEquals(modules,allText);

        Driver.closeBrowser();

    }

}
