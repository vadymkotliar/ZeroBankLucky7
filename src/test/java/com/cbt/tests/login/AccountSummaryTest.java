package com.cbt.tests.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.cbt.pages.AccountSummaryPage;
import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class AccountSummaryTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AccountSummaryPage accountSummaryPage;

    // Goara TC180

    @Test
    public void TC010_accountsBalanceSummery() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	accountSummaryPage = new AccountSummaryPage();
	homePage.signin.click();

	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	String actualAccountSummeryTab = accountSummaryPage.accountSummaryTab.getText();
	String expected = "Account Summary";
	System.out.println(actualAccountSummeryTab + "\n");
	assertEquals(actualAccountSummeryTab, expected);

	String actualCashAccountsTitle = accountSummaryPage.CashAccountsTitle.getText();
	String expectedTitle1 = "Cash Accounts";
	System.out.println(actualCashAccountsTitle + "------------");
	assertEquals(actualCashAccountsTitle, expectedTitle1);

	String actualcashSavings1 = accountSummaryPage.savings1.getText();
	String expected1 = "$1000";
	System.out.println(accountSummaryPage.savings1Title.getText() + " " + actualcashSavings1);
	assertEquals(actualcashSavings1, expected1);

	String actualcashSavings2 = accountSummaryPage.savings2.getText();
	String expected2 = "$1548";
	System.out.println(accountSummaryPage.savings2Title.getText() + " " + actualcashSavings2 + "\n");
	assertEquals(actualcashSavings2, expected2);

	String actualInvestmentAccountsTitle = accountSummaryPage.investmentAccountsTitle.getText();
	String expectedTitl2 = "Investment Accounts";
	System.out.println(actualInvestmentAccountsTitle + "------------");
	assertEquals(actualInvestmentAccountsTitle, expectedTitl2);

	String actualbrokarage = accountSummaryPage.brokarage.getText();
	String expected3 = "$197";
	System.out.println(accountSummaryPage.brokarageTitle.getText() + " " + actualbrokarage + "\n");
	assertEquals(actualbrokarage, expected3);

	String actualCreditAccountsTitle = accountSummaryPage.creditAccountsTitle.getText();
	String expectedTitl3 = "Credit Accounts";
	System.out.println(actualCreditAccountsTitle + "------------");
	assertEquals(actualCreditAccountsTitle, expectedTitl3);

	String actualVisaChecking = accountSummaryPage.visaChecking.getText();
	String expected4 = "$-500.2";
	System.out.println(accountSummaryPage.visaCheckingTitle.getText() + " " + actualVisaChecking);
	assertEquals(actualVisaChecking, expected4);

	String actualvisaCreditCard = accountSummaryPage.visaCreditCard.getText();
	String expected5 = "$-265";
	System.out.println(accountSummaryPage.visaCreditCardTitle.getText() + " " + actualvisaCreditCard + "\n");
	assertEquals(actualvisaCreditCard, expected5);

	String actualLoanAccountsTitle = accountSummaryPage.loanAccountsTitle.getText();
	String expectedTitl4 = "Loan Accounts";
	System.out.println(actualLoanAccountsTitle + "------------");
	assertEquals(actualLoanAccountsTitle, expectedTitl4);

	String actualLoan = accountSummaryPage.loan.getText();
	String expected6 = "$780";
	System.out.println(accountSummaryPage.loanTitle.getText() + " " + actualLoan + "\n");
	assertEquals(actualLoan, expected6);

    }

    @Test
    public void TC011_accountsBalanceSummery() throws InterruptedException {
	homePage = new HomePage();
	loginPage = new LoginPage();
	accountSummaryPage = new AccountSummaryPage();
	
	homePage.signin.click();
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	boolean b1 = accountSummaryPage.brokarageTitle.isEnabled();
	System.out.println(b1);
	boolean b2 = accountSummaryPage.loanTitle.isEnabled();
	System.out.println(b2);
	boolean b3 = accountSummaryPage.visaCheckingTitle.isEnabled();
	System.out.println(b3);
	assertTrue(accountSummaryPage.visaCreditCardTitle.isEnabled());
	assertTrue(accountSummaryPage.savings1Title.isEnabled());
	assertTrue(accountSummaryPage.savings2Title.isEnabled());

    }

}
