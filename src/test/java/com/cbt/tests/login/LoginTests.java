
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
    public void tc004NegativeSignIn() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	// Navigating to expected website
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	// Navigating to signin page
	homePage.signin.click();
	// Inserting singin credentials and signing in
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(" ", password);
	// Asserting that we are not logged in
	String expected = "Login and/or password are wrong.";
	String actual = driver.findElement(By.cssSelector(".alert.alert-error")).getText();
	assertEquals(actual, expected);

    }

    @Test()
    public void tc005NegativeSignIn() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	// Navigating to expected website
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	// Navigating to signin page
	homePage.signin.click();
	// Inserting singin credentials and signing in
	String userName = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	loginPage.login(" ", " ");
	// Asserting that we are not logged in
	String expected = "Login and/or password are wrong.";
	String actual = driver.findElement(By.cssSelector(".alert.alert-error")).getText();
	assertEquals(actual, expected);

    }

    @Test()
    public void TC006_positiveloginTest() {
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

    @Test
    public void TC007_negativeLoginTest() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	// Navigating to signin page
	homePage.signin.click();
	loginPage.userName.sendKeys("invalid");
	loginPage.password.sendKeys("test");
	loginPage.loginButton.click();
	String errMsg = loginPage.invalidUserNameErrMsg.getText();
	assertEquals(errMsg, "Login and/or password are wrong.");
    }

    @Test()
    public void smokeTest() {
	homePage = new HomePage();
	loginPage = new LoginPage();
	// Navigating to expected website
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
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

	// Asserting that displayed account username is the same as entered username
	String expected1 = userName;
	String actual1 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).getText();
	assertEquals(actual1, expected1);

    }

}
