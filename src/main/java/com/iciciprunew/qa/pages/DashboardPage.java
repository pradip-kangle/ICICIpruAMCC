package com.iciciprunew.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;

	@FindBy(xpath = "//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span")
	private WebElement userNameInputField;

	@FindBy(xpath = "(//a[@class='MuiTypography-root MuiTypography-menuOpenLink2 MuiLink-root MuiLink-underlineNone portfolio-quick-links new-transaction-btn css-1jf6fr1'])[2]")
	private WebElement newTransactionButton;

	@FindBy(xpath = "//button[@name='bt']")
	private WebElement createNewFolio;

	public DashboardPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnCreateNewFolio() {
		createNewFolio.click();

	}

	public void clickOnnewTransactionButton() {
		newTransactionButton.click();

	}

}
