package com.iciciprunew.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.iciciprunew.qa.utils.Utilities;

public class TransactionPage {

	Utilities utilities;

	public WebDriver driver;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[7]")
	private WebElement myFolioNumber;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5'][1]")
	private WebElement withdrawLink;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth NextBtn css-1hjhaxe']")
	private WebElement Next_Button;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body3 Bold start-link css-13jaz8d'])[1]")
	private WebElement Redeem;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-1q2h7u5'])[2]")
	private WebElement switchLink;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement liquidFundSelection;

	@FindBy(xpath = "//input[@name='redeemAmount']")
	private WebElement redeemAmountInputField;

	@FindBy(xpath = "//button[@name='CONTINUE']")
	private WebElement continueButton;

	@FindBy(xpath = "//button[@name='Continue']")
	private WebElement continueButton2;

	@FindBy(xpath = "(//div[@class='otp-grid'])")
	private WebElement OTPInputfield;

	@FindBy(xpath = "(//input[@name='termsCondition'])[1]")
	private WebElement CheckBox;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge continue__next-btn css-110xwq5']")
	private WebElement continueButton3;

	@FindBy(xpath = "(//input[@class='input input'])[1]")
	private WebElement OTPInputfield1;

	@FindBy(xpath = "(//input[@class='input input'])[2]")
	private WebElement OTPInputfield2;

	@FindBy(xpath = "(//input[@class='input input'])[3]")
	private WebElement OTPInputfield3;

	@FindBy(xpath = "(//input[@class='input input'])[4]")
	private WebElement OTPInputfield4;

	@FindBy(xpath = "(//input[@class='input input'])[5]")
	private WebElement OTPInputfield5;

	@FindBy(xpath = "(//input[@class='input input'])[6]")
	private WebElement OTPInputfield6;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 Reg css-1hpin22'])[2]")
	private WebElement RedeemtxnID;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body3 Bold start-link css-13jaz8d'])[1]")
	private WebElement switchStartLink;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	private WebElement BluechipFundSelection;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[2]")
	private WebElement SwitchInSchemedropdown;

	@FindBy(xpath = "//input[@value='Liquid Fund']")
	private WebElement EquityFundSelection;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[3]")
	private WebElement SchemeOptiondropdown;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart css-mnn31'])[2]")
	private WebElement swichtAmount;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium sip-btn css-1hw9j7s']")
	private WebElement continueButtonSwitch;

	public TransactionPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void redeemTrxn() throws InterruptedException {

		myFolioNumber.click();

		withdrawLink.click();
		Redeem.click();
		liquidFundSelection.click();
		redeemAmountInputField.sendKeys("1");
		continueButton.click();
		continueButton2.click();

	}

	public void switchTrxn() throws InterruptedException {

		myFolioNumber.click();

		switchLink.click();
		switchStartLink.click();
		liquidFundSelection.click();
		SwitchInSchemedropdown.sendKeys("Bluechip Fund");
		Thread.sleep(3000);
		SwitchInSchemedropdown.sendKeys(Keys.ARROW_DOWN);
		// Thread.sleep(5000);
		SwitchInSchemedropdown.sendKeys(Keys.ENTER);
		SchemeOptiondropdown.sendKeys("IDCW");
		Thread.sleep(3000);
		SchemeOptiondropdown.sendKeys(Keys.ARROW_DOWN);
		// Thread.sleep(5000);
		SchemeOptiondropdown.sendKeys(Keys.ENTER);
		swichtAmount.sendKeys("3");
		continueButtonSwitch.click();
		// button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained
		// MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium
		// MuiButton-root MuiButton-contained MuiButton-containedPrimary
		// MuiButton-sizeMedium MuiButton-containedSizeMedium sip-btn css-1hw9j7s']

	}

	public void setOTPintoOTPfield() throws InterruptedException {
		Thread.sleep(3000);
		String otp = Utilities.getOtp();
		System.out.println(otp.toString());
		Thread.sleep(5000);

		char a = otp.charAt(0);
		String p = String.valueOf(a);
		char b = otp.charAt(1);
		String q = String.valueOf(b);
		char c = otp.charAt(2);
		String r = String.valueOf(c);
		char d = otp.charAt(3);
		String s = String.valueOf(d);
		char e = otp.charAt(4);
		String t = String.valueOf(e);
		char f = otp.charAt(5);
		String u = String.valueOf(f);

		OTPInputfield1.sendKeys(p);
		Thread.sleep(3000);
		System.out.println(a);
		OTPInputfield2.sendKeys(q);
		Thread.sleep(3000);
		System.out.println(b);
		OTPInputfield3.sendKeys(r);
		Thread.sleep(3000);
		System.out.println(c);
		OTPInputfield4.sendKeys(s);
		Thread.sleep(3000);
		System.out.println(d);
		Thread.sleep(3000);
		OTPInputfield5.sendKeys(t);
		Thread.sleep(3000);
		System.out.println(e);
		OTPInputfield6.sendKeys(u);
		Thread.sleep(3000);
		System.out.println(f);
		Thread.sleep(3000);
		CheckBox.click();
		Thread.sleep(3000);
		continueButton3.click();
		Thread.sleep(3000);
		String redeentxnId = RedeemtxnID.getText();
		System.out.println(redeentxnId);

	}

}
