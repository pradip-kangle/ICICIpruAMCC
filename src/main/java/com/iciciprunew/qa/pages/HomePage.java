package com.iciciprunew.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	
	public WebDriver driver;

	@FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-menuOpenLink2 Bold gradient-btn-text css-13jaz8d']")
	private WebElement SIGN_IN_Button;

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userNameInputField;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth NextBtn css-1hjhaxe']")
	private WebElement Next_Button;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password_Field;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth NextBtn css-1hjhaxe']")
	private WebElement SIGN_IN_Button2;
	
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public DashboardPage SignInAccount(String userName,String PassWord) {
		
		SIGN_IN_Button.click();
		userNameInputField.sendKeys(userName);
		Next_Button.click();
		Password_Field.sendKeys(PassWord);
		SIGN_IN_Button2.click();
		
		return new DashboardPage(driver);
	}

}
