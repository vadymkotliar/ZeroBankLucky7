package com.cbt.tests.login;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.pages.TransferFundsPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;

public class TransferFundsTest extends TestBase{

	
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	TransferFundsPage transferFundsPage = new TransferFundsPage();

	@Test
	public void transferFundsTest() {
		
		homePage.signin.click();
		String userName = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage.login(userName, password);
		
		transferFundsPage.transferFundsTab.isDisplayed();
		transferFundsPage.transferFundsTab.click();
		
		transferFundsPage.boardHeader.isDisplayed();
		transferFundsPage.selectSavings.click();
		
		transferFundsPage.checkingAccount.click();
		transferFundsPage.amount.sendKeys("500", Keys.ENTER);
		
		transferFundsPage.submit.click();
		transferFundsPage.confirmResult.isDisplayed();
		
	}
}
