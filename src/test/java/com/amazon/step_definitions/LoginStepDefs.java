package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }





}
