package com.AD_ID.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AD_ID.constants.AppConstants;
import com.AD_ID.utils.ElementUtil;

public class SearchResultsPage {
	private WebDriver driver;
	private ElementUtil eleutil;

	private By productsResults = By.cssSelector("div.product-layout");

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	public int getSearchResultsCount() {

		return eleutil.waitForElementsVisible(productsResults, AppConstants.MEDIUM_TIME_OUT).size();

		//waitForElementsVisible
	}

	public ProductInfoPage selectProduct(String productName) {

		eleutil.clickElementWhenReady(By.linkText(productName), AppConstants.MEDIUM_TIME_OUT);

		return new ProductInfoPage(driver);

	}
}
