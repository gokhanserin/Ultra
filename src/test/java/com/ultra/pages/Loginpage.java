package com.ultra.pages;

import com.ultra.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    public Loginpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement input_username;

    @FindBy(id = "password")
    public WebElement input_password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(String username, String password){
        input_username.sendKeys(username);
        input_password.sendKeys(password);
    }

}
