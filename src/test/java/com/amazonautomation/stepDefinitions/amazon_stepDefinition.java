package com.amazonautomation.stepDefinitions;

import com.amazonautomation.pages.AmazonPage;
import com.amazonautomation.utilities.BrowserUtils;
import com.amazonautomation.utilities.ConfigurationReader;
import com.amazonautomation.utilities.Driver;
import com.amazonautomation.pages.AmazonPage;
import com.amazonautomation.utilities.BrowserUtils;
import com.amazonautomation.utilities.ConfigurationReader;
import com.amazonautomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class amazon_stepDefinition {

    AmazonPage page = new AmazonPage();

    @Given("buyer at Amazon home page")
    public void buyer_at_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        if(page.cookies.isDisplayed()){
            page.cookies.click();
        }
    }

    @When("buyer searches {string}")
    public void buyer_searches(String productName) {
        page.searchBtn.sendKeys(ConfigurationReader.getProperty("productName")+ Keys.ENTER);
    }
    @Then("the results are listed")
    public void the_results_are_listed() {

        List<String> phoneListName = BrowserUtils.getElementsText(page.phoneList);

        //Assert.assertEquals(8, phoneListName.size() );
        Assert.assertTrue(phoneListName.size()>=1);

    }
    @Then("buyer click on product")
    public void buyer_click_on() {

        BrowserUtils.getPhones(page.phoneList).get(0).click();




    }



    @Then("buyer check info product")
    public void buyerCheckInfoProduct() {


        String result = page.productTitle.getText().substring(6,15)
                + "  Size:" + page.productSize.getText()+"\n"
                + "Color:"+page.productColor.getText()+"  Price:" + page.productPrice.getText()+"\n"
                + "Stock:"+page.productStock.getText();
        System.out.println(result);
    }
}
