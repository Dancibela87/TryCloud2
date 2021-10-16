package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFiles {

    @FindBy(css = "#header > div.header-right > div.header-menu.unified-search > a > span")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement inputBox;


    public WebElement getSearchBtn() {
        return searchBtn;

    }

    public WebElement getInputBox() {
        return inputBox;
    }

    public SearchFiles(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


}
