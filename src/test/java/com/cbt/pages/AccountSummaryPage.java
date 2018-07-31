package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class AccountSummaryPage {
	
	public AccountSummaryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id = "account_summary_tab")
	public WebElement accountSummaryTab;
	
	@FindBy(xpath="//h2[@class='board-header'][1]")
	public WebElement CashAccountsTitle;

	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[1]")
	public WebElement savings1;
	
	@FindBy(xpath ="(//table[@class='table']/tbody/tr/td[1])[1]")
	public WebElement savings1Title;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[2]")
	public WebElement savings2;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[1])[2]")
	public WebElement savings2Title;
	
	@FindBy(xpath="//h2[@class='board-header'][2]")
	public WebElement investmentAccountsTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[1])[3]")
	public WebElement brokarageTitle;
	
	@FindBy(xpath="//h2[@class='board-header'][3]")
	public WebElement creditAccountsTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[3]")
	public WebElement brokarage;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[1])[4]")
	public WebElement visaCheckingTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[4]")
	public WebElement visaChecking;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[1])[5]")
	public WebElement visaCreditCardTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[5]")
	public WebElement visaCreditCard;
	
	@FindBy(xpath="//h2[@class='board-header'][4]")
	public WebElement loanAccountsTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[1])[6]")
	public WebElement loanTitle;
	
	@FindBy(xpath = "(//table[@class='table']/tbody/tr/td[3])[6]")
	public WebElement loan;
	
	
}
