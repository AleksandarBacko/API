package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page {
    public login_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "signin_button")
    public WebElement signinButton;

    @FindBy(id = "user_login")
    public WebElement userLogin;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement submite;

    @FindBy(id = "primary-button")
    public WebElement backToSefty;



    @FindBy(xpath = "//i[@class='icon-user']")
    public WebElement usernameInfo;

    @FindBy(id = "details-button")
    public WebElement advanced;

    @FindBy(id = "proceed-link")
    public WebElement proceedLink;



    public void logsIn(){
        userLogin.sendKeys("username");
        passwordInput.sendKeys("password");
        submite.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(advanced));
        advanced.click();
        wait.until(ExpectedConditions.visibilityOf(proceedLink));
        proceedLink.click();

    }
}
