package com.cybertek.pages.nextBasePage;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nextBaseLoginPage {
    public nextBaseLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameNB;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordNB;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement LogInButtonNB;

    @FindBy (id = "USER_REMEMBER")
    public WebElement rememberUserCheckBoxNB;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordNB;
}
