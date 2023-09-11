package com.ultra.pages;

import com.ultra.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "title")
    public WebElement title_product;
}
