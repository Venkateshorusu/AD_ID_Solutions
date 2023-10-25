package com.AD_ID.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.AD_ID.factory.DriverFactory;
import com.AD_ID.listeners.ExtentReportListener;
import com.AD_ID.pages.LoginPage;
import com.AD_ID.pages.SalesCloudHomePage;

public class BaseTest {

	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginpage;
	protected SalesCloudHomePage salesCloudHomePage;

	protected ExtentReportListener extendLogger;

	protected DriverFactory df;
	protected SoftAssert softAssert;
 
	@BeforeTest
	public void setup() {

		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		loginpage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
