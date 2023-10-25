package com.AD_ID.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AD_ID.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Epic("EPIC - 0001 : Configuring the Quote and Sent it to the EBS")
@Story("US - 01 : Configuring the labels And Tags  and sending it to the EBS")
public class LabelsAndTagsConfiguration extends BaseTest {

	@Test(priority = 0)
	@Description(" login to CPQ ")
	@Severity(SeverityLevel.BLOCKER)
	public void logintoCPQ() {

		loginpage.doLoginToCPQ(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.getLoginPageTitle();

	}

	@Test(priority = 1)
	@Description("labels And Tags Configuration  ")
	@Severity(SeverityLevel.CRITICAL)
	public void labelsAndTagsConfiguration() {

		String backgroundColorofSentToEBS = loginpage
				.doLogin(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("url2"))
				.oscQuoteCreation().addLineItem().modelConfiguration().materialConfiguration()
				.constructionConfiguration().validate().DemandConfiguration().addToTransaction()
				.saveAndSubmitforApproval().reqSignature().submitPricingApproval().reconfigure().setupTask()
				.SubmitPricingApproval();

		Assert.assertEquals(backgroundColorofSentToEBS, "rgba(227, 31, 38, 1)");

	}
}
