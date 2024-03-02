package com.iciciprunew.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public TransactionPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void redeemTransaction() throws InterruptedException {

		myFolioNumber.click();

		withdrawLink.click();
		Redeem.click();
		liquidFundSelection.click();
		redeemAmountInputField.sendKeys("1");
		continueButton.click();
		continueButton2.click();

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
