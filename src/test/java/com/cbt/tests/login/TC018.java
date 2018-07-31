package com.cbt.tests.login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class TC018 extends TestBase{

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	
	@Test()
	public void SPA186() {
		homePage.signin.click();
		
		String userName = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage.login(userName, password);
		
		homePage.onlineStatements.click();
		
		String expected = "Zero - Online Statements";
		String actual = Driver.getDriver().getTitle();
		assertEquals(actual, expected);
		
	}
	
}
