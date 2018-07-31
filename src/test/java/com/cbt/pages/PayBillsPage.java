package com.cbt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utilities.Driver;

public class PayBillsPage {
    public PayBillsPage() {
	PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(id="pay_bills_tab")
    public WebElement payBillsTab;
    
    @FindBy(id="sp_payee")
    public WebElement payeeDropdown;
    
    @FindBy(id="sp_account")
    public WebElement accountDropdown;
    
    @FindBy(id="sp_amount")
    public WebElement amount;    
    
    @FindBy(id="sp_date")
    public WebElement date;
    
    @FindBy(id="sp_description")
    public WebElement description;    
    
    @FindBy(id="pay_saved_payees")
    public WebElement payButton;
    
    @FindBy(xpath="//h2[.='Make payments to your saved payees']")
    public WebElement makePaymentsToYourSavedpayees;
    
    
  
}
