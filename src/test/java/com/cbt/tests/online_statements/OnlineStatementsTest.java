package com.cbt.tests.online_statements;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.pages.OnlineStatements;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;

public class OnlineStatementsTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    OnlineStatements onlineStatements;

    @Test
    public void TC019_StatementPositive() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	onlineStatements = new OnlineStatements();
	homePage.signin.click();
	loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

	onlineStatements.onlineStatementsTab.click();
	Select select = new Select(onlineStatements.accountDropdown);
	select.selectByVisibleText("Checking");

	assertTrue(onlineStatements.year2009.isDisplayed(), "Year 2009 is not displayed");
	onlineStatements.year2009.click();

    }
}
