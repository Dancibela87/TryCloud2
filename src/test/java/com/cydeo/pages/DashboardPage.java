package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[1]/a")
    private WebElement dashboardModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    private WebElement filesModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[3]/a")
    private WebElement photoesModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[4]/a")
    private WebElement activityModule;

    @FindBy(xpath ="//*[@id=\"appmenu\"]/li[5]/a")
    private WebElement talkModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]/a")
    private WebElement mailModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    private WebElement contactsModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]/a")
    private WebElement circleModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[9]/a")
    private WebElement calendarModule;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[10]/a")
    private WebElement deckModule;

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement getDashboardModule() {
        return dashboardModule;
    }

    public WebElement getFilesModule() {
        return filesModule;
    }

    public WebElement getPhotoesModule() {
        return photoesModule;
    }

    public WebElement getActivityModule() {
        return activityModule;
    }

    public WebElement getTalkModule() {
        return talkModule;
    }

    public WebElement getMailModule() {
        return mailModule;
    }

    public WebElement getContactsModule() {
        return contactsModule;
    }

    public WebElement getCircleModule() {
        return circleModule;
    }

    public WebElement getCalendarModule() {
        return calendarModule;
    }

    public WebElement getDeckModule() {
        return deckModule;
    }
}

