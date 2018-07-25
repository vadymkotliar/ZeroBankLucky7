package com.cbt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cbt.utilities.Driver;

public class HomePage {
    public HomePage() {
	PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signin;

}
