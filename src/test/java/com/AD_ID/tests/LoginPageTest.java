package com.AD_ID.tests;

import org.testng.annotations.Test;

import com.AD_ID.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("EPIC - 1414 : Design of the login page for the open cart application")
@Story("US - 14 : Implementation of login page feature for the open cart application")
public class LoginPageTest extends BaseTest {

	
	@Description("Check user is able to login to the application with correct user name and correct password")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1)
	public void loginTest() {

		loginpage.doLoginToCPQ(prop.getProperty("username"), prop.getProperty("password"));

		salesCloudHomePage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("url2"));
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Description("Verify successful login")
//	@Severity(SeverityLevel.NORMAL)
//	@Test(priority = 1)
//	public void verifySuccessfulLogin() {
//		loginpage.doLogin("standard_user", "secret_sauce");
//		// Verify successful login
////	        Assert.assertTrue(yourAssertionCondition, "Login was successful.");
//	}
//
//	@Description("Verify failed login with incorrect password")
//	@Severity(SeverityLevel.CRITICAL)
//	@Test(priority = 2)
//	public void verifyFailedLoginWithIncorrectPassword() {
//		loginpage.doLogin("standard_user", "incorrect_password");
//		// Verify failed login with incorrect password
////	        Assert.assertTrue(yourAssertionCondition, "Login failed with incorrect password.");
//	}
//
//	@Description("Verify failed login with incorrect username")
//	@Severity(SeverityLevel.CRITICAL)
//	@Test(priority = 3)
//	public void verifyFailedLoginWithIncorrectUsername() {
//		loginpage.doLogin("incorrect_username", "secret_sauce");
//		// Verify failed login with incorrect username
////	        Assert.assertTrue(yourAssertionCondition, "Login failed with incorrect username.");
//	}
//
//	@Description("Verify logout functionality")
//	@Severity(SeverityLevel.NORMAL)
//	@Test(priority = 4)
//	public void verifyLogoutFunctionality() {
//		loginpage.doLogin("standard_user", "secret_sauce");
//		// Perform logout actions
//		// Verify successful logout
////	        Assert.assertTrue(yourAssertionCondition, "Logout was successful.");
//	}
//
//}
