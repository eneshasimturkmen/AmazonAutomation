package com.amazonautomation.pages;

import com.amazonautomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "a-autoid-0")
    public WebElement cookies;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> phoneList;

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(xpath = "(//span[.='512 GB'])[1]")
    public WebElement productSize;

    @FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[2]")
    public WebElement productPrice;

    @FindBy(xpath = "//span[.='    Stokta var.   ']")
    public WebElement productStock;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement productColor;



}
