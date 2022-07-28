package com.amazonautomation.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement eachElement : list) {
            if (eachElement.getText().contains("iPhone 13 (512 GB)")||
            eachElement.getText().contains("iPhone 13 mini")||
            eachElement.getText().contains("Apple iPhone 13 Pro")) {
                elemTexts.add(eachElement.getText());
            }
        }
        System.out.println(elemTexts);
        return elemTexts;
    }


    public static List<WebElement> getPhones(List<WebElement> list) {
        List<WebElement> elemTexts = new ArrayList<>();
        for (WebElement eachElement : list) {
            if (eachElement.getText().contains("iPhone 13 (512 GB)")||
                    eachElement.getText().contains("iPhone 13 mini")||
                    eachElement.getText().contains("Apple iPhone 13 Pro")) {
                elemTexts.add(eachElement);
            }
        }
        System.out.println(elemTexts);
        return elemTexts;
    }

}
