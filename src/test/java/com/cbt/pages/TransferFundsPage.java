package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class TransferFundsPage {

	public TransferFundsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//li[@id='transfer_funds_tab']")
	public WebElement transferFundsTab;
	
	@FindBy(xpath = "//h2[@class='board-header']")
	public WebElement boardHeader;
	
	@FindBy(xpath = "//select[@id='tf_fromAccountId']/option[1]")
	public WebElement selectSavings;
	
	@FindBy(xpath = "//select[@id='tf_toAccountId']/option[2]")
	public WebElement checkingAccount;
	
	@FindBy(id = "tf_amount")
	public WebElement amount;
	
	@FindBy(id = "btn_submit")
	public WebElement submit;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement confirmResult;
	
	

}
