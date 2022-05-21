package com.amazon.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchText;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButtn;

    @FindBy(xpath = "//span[@class = 'a-color-state a-text-bold']")
    public WebElement resultText;












}
