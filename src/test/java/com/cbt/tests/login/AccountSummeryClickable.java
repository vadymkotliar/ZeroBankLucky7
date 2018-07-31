package com.cbt.tests.login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cbt.pages.AccountSummaryPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;

public class AccountSummeryClickable  extends TestBase{
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	AccountSummaryPage accountSummeryPage = new AccountSummaryPage();
	
	@Test 
	public void accountsBalanceSummery() {
		homePage.signin.click();

		
		String userName = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage.login(userName, password);
		
		boolean b1 =accountSummeryPage.brokarageTitle.isEnabled();
		System.out.println(b1);
		boolean b2 =accountSummeryPage.loanTitle.isEnabled();
		System.out.println(b2);
		boolean b3 =accountSummeryPage.visaCheckingTitle.isEnabled();
		System.out.println(b3);
		assertTrue(accountSummeryPage.visaCreditCardTitle.isEnabled());
		assertTrue(accountSummeryPage.savings1Title.isEnabled());
		assertTrue(accountSummeryPage.savings2Title.isEnabled());
		
		
		
		
		
		
		
	

}
}