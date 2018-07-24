package com.cbt.tests.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cbt.pages.LoginPage;
import com.cbt.tests.TestBase;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;

public class LoginTests extends TestBase {

    @Test()
    public void positiveloginTest() {
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    
    
//  READY TO USE
//    @Test(priority = 2, groups = {})
//    public void positiveLoginUsingPOM() {
//
//    }

}
