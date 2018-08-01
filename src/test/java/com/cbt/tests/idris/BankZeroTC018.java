package com.cbt.tests.idris;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.cbt.pages.AllOrdersPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class BankZeroTC018 extends TestBase {

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	AllOrdersPage onlineStatemant = new AllOrdersPage();

	@Test()
	public void SPA186() {
		homePage.signin.click();

		String userName = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage.login(userName, password);

		onlineStatemant.onlineStatements.click();

		String expected = "Zero - Online Statements";
		String actual = Driver.getDriver().getTitle();
		assertEquals(actual, expected);

	}

}
