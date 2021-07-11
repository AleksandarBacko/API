package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class amazonPage {
    public amazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='nav-a  ']")
    public List<WebElement> tabs;

    public WebElement Tab (String Text){
        String locator = "//a[.=\""+Text+"\"]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-tall-aspect']")
    public WebElement firstHat;

    @FindBy(id = "price_inside_buybox")
    public WebElement price;

    @FindBy (xpath = "//select[@name='quantity']")
    public WebElement quantityDropDown;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCart;

    @FindBy(css = "#nav-cart-count")
    public WebElement cart;

    @FindBy(css = "#sc-subtotal-label-activecart")
    public WebElement subTotalText;

    @FindBy(css = "#sc-subtotal-amount-activecart")
    public WebElement subTotalAmount;

}
