package com.demoblaze.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void sleep(int secund) {
        secund*=1000;
        try {
            Thread.sleep(secund);
        } catch (InterruptedException e) {          //nasloni na sleep i izaberi more options i try/catch -isto radi kao i import nasloni opcija
            e.printStackTrace();
        }

    }
    public static List<String> getElementsText (List<WebElement> list){
        List<String> elemTexts = new ArrayList<>();
        for (WebElement element : list) {
            elemTexts.add(element.getText());
        }
        return elemTexts;
    }
}
