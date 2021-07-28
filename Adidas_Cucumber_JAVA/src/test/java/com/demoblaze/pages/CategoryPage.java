package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CategoryPage {
    public CategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(linkText = "Phones")
//    public WebElement phoneCategory;



    public WebElement dinString(String category){
       return Driver.getDriver().findElement(By.linkText(category));
    }

    @FindBy (xpath = "//h4[@class='card-title']")
    public List<WebElement> devices;

    public List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
