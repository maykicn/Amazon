package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.GeneralUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage=new LoginPage();
        loginPage.cookieButton.click();
        GeneralUtils.waitFor(10);

        //4.satır
        //5.satır
        //6.satır
        //7.satır
        //8.satır
        //9.satır
        //10.satır - aykut

    }

    @Then("the user should be {string}")
    public void the_user_should_be(String expectedUrl) {

        String actualUrl=Driver.get().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

    }





}
