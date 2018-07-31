package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class OnlineStatements {
    	public OnlineStatements() {
    	    PageFactory.initElements(Driver.getDriver(), this);
    	}
    	@FindBy(id="online_statements_tab")
    	public WebElement onlineStatementsTab;
    	
    	@FindBy(id="os_accountId")
    	public WebElement accountDropdown;
    	
    	@FindBy(xpath="//a[.='2009']")
    	public WebElement year2009;
    	
    	
}
