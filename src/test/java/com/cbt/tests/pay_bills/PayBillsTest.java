package com.cbt.tests.pay_bills;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.pages.PayBillsPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;

public class PayBillsTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PayBillsPage payBillsPage = new PayBillsPage();

    @Test
    public void TC017_PayBillsNegative() {
	homePage.signin.click();
	loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

	payBillsPage.payBillsTab.click();
	Select select = new Select(payBillsPage.payeeDropdown);
	select.selectByValue("wellsfargo");	
	select = new Select(payBillsPage.accountDropdown);
	select.selectByValue("5");
	select.selectByIndex(0);
	payBillsPage.date.sendKeys("2018-07-16");
	payBillsPage.description.sendKeys("default decription");
	payBillsPage.payButton.click();

	String expected = "Make payments to your saved payees";
	String actual = payBillsPage.makePaymentsToYourSavedpayees.getText();
	assertEquals(actual, expected, "Text does not match");

    }
}
