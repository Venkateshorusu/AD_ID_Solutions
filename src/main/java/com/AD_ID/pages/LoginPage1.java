package com.AD_ID.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AD_ID.constants.AppConstants;
import com.AD_ID.utils.ElementUtil;
import com.AD_ID.utils.JavaScriptUtil;

import io.qameta.allure.Step;

public class LoginPage1 {

	// page changing model

	private WebDriver driver;
	private ElementUtil eleutil;
	private JavaScriptUtil JSUtil;
	

	private By emailID = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button"); 
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		JSUtil=new JavaScriptUtil(driver);
	}

	 

	@Step("Login to application username : {0} and password : {1}")
	public void doLogin(String username, String pwd) {

		System.out.println("Application Credentials: " + username + ":" + pwd);

		eleutil.waitForElementVisible(emailID, AppConstants.MEDIUM_TIME_OUT).sendKeys(username);
		eleutil.waitForElementVisible(password, AppConstants.MEDIUM_TIME_OUT).sendKeys(pwd);
		eleutil.doClick(loginBtn);
		JSUtil.scrollPageDown();
		 

		 
	}

	 

}
