package com.amazon.step_definitions;

import com.amazon.pages.MainPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class MainStepDefs {
    MainPage mainPage = new MainPage();


    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter {string} on the main page search tab")
    public void the_user_enter_on_the_main_page_search_tab(String enterText) {
        mainPage.searchText.click();
        mainPage.searchText.sendKeys(enterText);
    }

    @When("the user clicks search button on the search tab")
    public void the_user_clicks_search_button_on_the_search_tab() {
        mainPage.searchButtn.click();
    }

    @Then("verify that result matches {string}")
    public void verify_that_result_matches(String expectedResult) {
        String actualResult =  mainPage.resultText.getText();
        actualResult = actualResult.substring(1,actualResult.length()-1);
        Assert.assertEquals(expectedResult,actualResult);
    }





}
