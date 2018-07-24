package com.cbt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class LoginPage {

    public LoginPage() {
	PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "")
    public WebElement userName;

    @FindBy(id = "")
    public WebElement password;

    @FindBy(id = "")
    public WebElement loginButton;

    @FindBy(id = "")
    public WebElement invalidUserNameErrMsg;

    public void login(String uid, String pwd) {
	userName.sendKeys(uid);
	password.sendKeys(pwd);
	loginButton.click();
    }

}
