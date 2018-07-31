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

public class AccountSummeryTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AccountSummaryPage accountSummeryPage;

    // Goara TC180

    @Test
    public void TC010_accountsBalanceSummery() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	accountSummeryPage = new AccountSummaryPage();
	homePage.signin.click();

	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	String actualAccountSummeryTab = accountSummeryPage.accountSummaryTab.getText();
	String expected = "Account Summary";
	System.out.println(actualAccountSummeryTab + "\n");
	assertEquals(actualAccountSummeryTab, expected);

	String actualCashAccountsTitle = accountSummeryPage.CashAccountsTitle.getText();
	String expectedTitle1 = "Cash Accounts";
	System.out.println(actualCashAccountsTitle + "------------");
	assertEquals(actualCashAccountsTitle, expectedTitle1);

	String actualcashSavings1 = accountSummeryPage.savings1.getText();
	String expected1 = "$1000";
	System.out.println(accountSummeryPage.savings1Title.getText() + " " + actualcashSavings1);
	assertEquals(actualcashSavings1, expected1);

	String actualcashSavings2 = accountSummeryPage.savings2.getText();
	String expected2 = "$1548";
	System.out.println(accountSummeryPage.savings2Title.getText() + " " + actualcashSavings2 + "\n");
	assertEquals(actualcashSavings2, expected2);

	String actualInvestmentAccountsTitle = accountSummeryPage.investmentAccountsTitle.getText();
	String expectedTitl2 = "Investment Accounts";
	System.out.println(actualInvestmentAccountsTitle + "------------");
	assertEquals(actualInvestmentAccountsTitle, expectedTitl2);

	String actualbrokarage = accountSummeryPage.brokarage.getText();
	String expected3 = "$197";
	System.out.println(accountSummeryPage.brokarageTitle.getText() + " " + actualbrokarage + "\n");
	assertEquals(actualbrokarage, expected3);

	String actualCreditAccountsTitle = accountSummeryPage.creditAccountsTitle.getText();
	String expectedTitl3 = "Credit Accounts";
	System.out.println(actualCreditAccountsTitle + "------------");
	assertEquals(actualCreditAccountsTitle, expectedTitl3);

	String actualVisaChecking = accountSummeryPage.visaChecking.getText();
	String expected4 = "$-500.2";
	System.out.println(accountSummeryPage.visaCheckingTitle.getText() + " " + actualVisaChecking);
	assertEquals(actualVisaChecking, expected4);

	String actualvisaCreditCard = accountSummeryPage.visaCreditCard.getText();
	String expected5 = "$-265";
	System.out.println(accountSummeryPage.visaCreditCardTitle.getText() + " " + actualvisaCreditCard + "\n");
	assertEquals(actualvisaCreditCard, expected5);

	String actualLoanAccountsTitle = accountSummeryPage.loanAccountsTitle.getText();
	String expectedTitl4 = "Loan Accounts";
	System.out.println(actualLoanAccountsTitle + "------------");
	assertEquals(actualLoanAccountsTitle, expectedTitl4);

	String actualLoan = accountSummeryPage.loan.getText();
	String expected6 = "$780";
	System.out.println(accountSummeryPage.loanTitle.getText() + " " + actualLoan + "\n");
	assertEquals(actualLoan, expected6);

    }

    @Test
    public void TC011_accountsBalanceSummery() throws InterruptedException {
	homePage = new HomePage();
	loginPage = new LoginPage();
	accountSummeryPage = new AccountSummaryPage();
	
	homePage.signin.click();
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	boolean b1 = accountSummeryPage.brokarageTitle.isEnabled();
	System.out.println(b1);
	boolean b2 = accountSummeryPage.loanTitle.isEnabled();
	System.out.println(b2);
	boolean b3 = accountSummeryPage.visaCheckingTitle.isEnabled();
	System.out.println(b3);
	assertTrue(accountSummeryPage.visaCreditCardTitle.isEnabled());
	assertTrue(accountSummeryPage.savings1Title.isEnabled());
	assertTrue(accountSummeryPage.savings2Title.isEnabled());

    }

}
