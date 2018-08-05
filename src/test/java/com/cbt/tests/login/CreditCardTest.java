package com.cbt.tests.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cbt.pages.AccountActivityPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;


public class CreditCardTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @Test()
    public void AccountActivityCreditCard() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	homePage.signin.click();
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	AccountActivityPage accountTab = new AccountActivityPage();
	accountTab.AccountactivityTab.click();

	WebElement selectTag = accountTab.DropDown;
	selectTag.click();

	Select list = new Select(selectTag);
	list.selectByValue("5");

	String expected = "Show Transactions";
	String actual = accountTab.TransactionsText.getText();
	assertEquals(actual, expected);
    }
}
