package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class etsyPage {
    public etsyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchEtsy;

    @FindBy(xpath = "//button[@class='wt-input-btn-group__btn global-enhancements-search-input-btn-group__btn']")
    public WebElement searchButton;




}

