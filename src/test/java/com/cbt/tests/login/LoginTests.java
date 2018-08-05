
package com.cbt.tests.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cbt.pages.HomePage;
import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @Test()
    public void positiveloginTest() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	// Navigating to signin page
	homePage.signin.click();

	// Inserting singin credentials and signing in
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(userName, password);

	// Asserting that we are loged in
	String expected = "Zero - Account Summary";
	String actual = Driver.getDriver().getTitle();
	assertEquals(actual, expected);
    }

//    @Test()
//    public void RandomTest() {
//	System.out.println("Second test");
//    }

}
