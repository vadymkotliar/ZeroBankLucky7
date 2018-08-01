package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class AllOrdersPage {

	public AllOrdersPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	 @FindBy(id = "online_statements_tab")
	    public WebElement onlineStatements;
	    
	    @FindBy(id = "account_activity_tab")
	    public WebElement accountActivity;
	    
	    @FindBy(id = "transfer_funds_tab")
	    public WebElement transferFunds;
	    
	    @FindBy(id = "pay_bills_tab")
	    public WebElement payBills;
	    
	    @FindBy(id = "money_map_tab")
	    public WebElement moneyMap;
	    
	
	
}
