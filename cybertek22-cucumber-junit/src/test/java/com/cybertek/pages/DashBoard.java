package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class DashBoard {
   public DashBoard(){
       PageFactory.initElements(Driver.getDriver(),this);
   }



   @FindBy(xpath = "//a[@class='nav-a  ']")
    public List<WebElement> listOfTabs;


    public static void getListOfTabsPrinted() {
        DashBoard dashBoard = new DashBoard();
        for (int i = 0; i < dashBoard.listOfTabs.size(); i++) {
            if (!dashBoard.listOfTabs.get(i).getText().isEmpty()) {
                System.out.println("List of Tabs contain = " + dashBoard.listOfTabs.get(i).getText());
            }
        }
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    public static void searchForItem(String addItem){
        DashBoard dashBoard=new DashBoard();
        dashBoard.searchBox.sendKeys(addItem);
        dashBoard.searchBox.sendKeys(Keys.ENTER);
        System.out.println("+++++++ Search for item - "+addItem+" +++++++");
    }



    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-tall-aspect']")
    public List<WebElement> listOFHats;

    @FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[1]")
    public WebElement quantityButton;

    @FindBy(xpath = "(//ul[@class='a-nostyle a-list-link'])/li[2]")
    public WebElement chooseQuantity2;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    public static void addToCart(){
        DashBoard dashBoard=new DashBoard();
        dashBoard.listOFHats.get(0).click();
        dashBoard.quantityButton.click();
        dashBoard.chooseQuantity2.click();
        dashBoard.addToCartButton.click();
        System.out.println("+++++++ Item added in Cart +++++++");
    }

    @FindBy(id = "nav-cart-count-container")
    public WebElement cart;
    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
    public WebElement Totalprice;
    @FindBy (id = "sc-subtotal-label-buybox" )
    public WebElement umberOfItemsInProceed;

    @FindBy (className = "a-dropdown-label")
    public WebElement chooseQuantity;

    @FindBy(xpath = "//a[@id='dropdown2_1']")
    public WebElement quantity1;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")
    public WebElement totalPriceAfterReducing;

    public static void reducingItemInCArt(){
        DashBoard dashBoard=new DashBoard();
        dashBoard.cart.click();
        String expectedPrice=dashBoard.Totalprice.getText();
        String expectedTotalitems="2";
       Assert.assertEquals(expectedPrice,dashBoard.Totalprice.getText());
        Assert.assertTrue(dashBoard.umberOfItemsInProceed.getText().contains(expectedTotalitems));
        System.out.println("Total number of items is = "+ dashBoard.umberOfItemsInProceed.getText());
        System.out.println("Total price is = "+dashBoard.Totalprice.getText());
        dashBoard.chooseQuantity.click();
        dashBoard.chooseQuantity2.click();

        BrowserUtils.sleep(3);
        System.out.println("+++++++ Item is remove from shopping list +++++++");

        String expectedPriceafter=dashBoard.totalPriceAfterReducing.getText();
        String expectedTotalitemsafter="1";
        System.out.println("Total number of items is = "+ dashBoard.umberOfItemsInProceed.getText());
        System.out.println("Total price is = "+dashBoard.totalPriceAfterReducing.getText());
        Assert.assertEquals(expectedPriceafter,dashBoard.totalPriceAfterReducing.getText());
        Assert.assertTrue(dashBoard.umberOfItemsInProceed.getText().contains(expectedTotalitemsafter));



    }
}
