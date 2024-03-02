package com.iciciprunew.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KYCRegisterPage {

WebDriver driver;
	
	@FindBy(xpath = "//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span")
	private WebElement userNameInputField;
	
	@FindBy(xpath = "//div[@class='mt-3']//a[@class='MuiTypography-root MuiTypography-menuOpenLink2 MuiLink-root MuiLink-underlineNone portfolio-quick-links new-transaction-btn css-1jf6fr1'][1]")
	private WebElement newTransactionButton;
	
	@FindBy(xpath = "//input[@value='bb3395b5-b821-4da6-9611-b93a264f5494']")
	private WebElement myFolioNumber;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5'][1]")
	private WebElement withdrawLink;
	
	
	//https://www.beta.icicipruamc.com/dashboard/transaction#:~:text=your%20invested%20Schemes-,START,-SWP
	
	//div[@class='mt-3']//a[@class='MuiTypography-root MuiTypography-menuOpenLink2 MuiLink-root MuiLink-underlineNone portfolio-quick-links new-transaction-btn css-1jf6fr1'][1]
public KYCRegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
