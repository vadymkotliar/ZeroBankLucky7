package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class AccountActivityPage {
	 public AccountActivityPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		    }
	 
	 @FindBy(xpath = "//*[@id=\"account_activity_tab\"]/a")
	    public WebElement AccountactivityTab;
	 
	 @FindBy(id = "aa_accountId")
	    public WebElement DropDown;

	 @FindBy(xpath = "//*[@id=\"ui-tabs-1\"]/h2")
	 	public WebElement TransactionsText;
}
