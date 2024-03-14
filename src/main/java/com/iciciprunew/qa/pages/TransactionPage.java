package com.iciciprunew.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.iciciprunew.qa.utils.WriteDataIntoExcel;
import com.iciciprunew.qa.utils.ExtentReporter2;
import com.iciciprunew.qa.utils.Utilities;
import com.iciciprunew.qa.utils.WriteDataIntoExcel;

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

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth confirm-continue__btn css-1hjhaxe']")
	private WebElement continueButtonSwitch2;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 Reg css-1hpin22'])[2]")
	private WebElement SwitchtxnID;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body3 Bold start-link css-13jaz8d'])[2]")
	private WebElement sipLink;

	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart css-mnn31']")
	private WebElement sipInstallmentAmount;

	@FindBy(xpath = "(//img[@class='cursor-pointer'])[1]")
	private WebElement CalenderImg;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1'])[4]")
	private WebElement sipDate;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge sip-btn sip-btn__ios css-110xwq5']")
	private WebElement ProceedtoPaymentButton;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[2]")
	private WebElement SelectFund;

	@FindBy(xpath = "(//img[@src='/static/media/downArrow.d4557212.svg'])[2]")
	private WebElement selectFundArrowButton;

	@FindBy(xpath = "(//input[@class='input'])[1]")
	private WebElement OTPInputfieldforSip1;

	@FindBy(xpath = "(//input[@class='input'])[2]")
	private WebElement OTPInputfieldforSip2;

	@FindBy(xpath = "(//input[@class='input'])[3]")
	private WebElement OTPInputfieldforSip3;

	@FindBy(xpath = "(//input[@class='input'])[4]")
	private WebElement OTPInputfieldforSip4;

	@FindBy(xpath = "(//input[@class='input'])[5]")
	private WebElement OTPInputfieldforSip5;

	@FindBy(xpath = "(//input[@class='input'])[6]")
	private WebElement OTPInputfieldforSip6;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth confirm-continue__btn css-1hjhaxe']")
	private WebElement coninueButtonForSip;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge btn-proceed ml-3 css-110xwq5']")
	private WebElement ProceedtoPaymentButtonForSip;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body3 Bold start-link css-13jaz8d'])[1]")
	private WebElement PurchaseLink;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[1]")
	private WebElement SelectFundCatogory;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[2]")
	private WebElement SelectFundSIp;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-2duac4'])[3]")
	private WebElement SchemeOpionsosip;

	@FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-button2 Bold primary css-13jaz8d']")
	private WebElement ProceedtoPaymentButtonForPurchase;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth confirm-continue__btn css-1hjhaxe']")
	private WebElement coninueButtonForPurchase;

	public TransactionPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void redeemTrxn() throws InterruptedException, IOException {

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

		Actions action = new Actions(driver);
		action.sendKeys(SwitchInSchemedropdown, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		
		  //SwitchInSchemedropdown.sendKeys(Keys.ARROW_DOWN); // Thread.sleep(5000);
		 // SwitchInSchemedropdown.sendKeys(Keys.ENTER);
		  SchemeOptiondropdown.sendKeys("Growth"); 
		  Thread.sleep(3000);
		  SchemeOptiondropdown.sendKeys(Keys.ARROW_DOWN); // Thread.sleep(5000);
		  SchemeOptiondropdown.sendKeys(Keys.ENTER);
		 
		swichtAmount.sendKeys("3");
		continueButtonSwitch.click();

	}

	public void sipTxn() throws InterruptedException {

		myFolioNumber.click();

		sipLink.click();
		Thread.sleep(3000);
		selectFundArrowButton.click();
		SelectFund.sendKeys("Liquid");
		Thread.sleep(3000);
		SwitchInSchemedropdown.sendKeys(Keys.ARROW_DOWN);
		SwitchInSchemedropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		SwitchInSchemedropdown.sendKeys(Keys.ENTER);

		SchemeOptiondropdown.sendKeys("Growth");
		Thread.sleep(3000);
		SchemeOptiondropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SchemeOptiondropdown.sendKeys(Keys.ENTER);
		sipInstallmentAmount.sendKeys("100");
		CalenderImg.click();
		sipDate.click();
		ProceedtoPaymentButton.click();

	}

	public void PurchaseTxn() throws InterruptedException {

		myFolioNumber.click();

		PurchaseLink.click();
		Thread.sleep(3000);
		SelectFundCatogory.click();
		SelectFundCatogory.sendKeys("Debt Funds");
		Thread.sleep(3000);
		SelectFundCatogory.sendKeys(Keys.ARROW_DOWN);
		SelectFundCatogory.sendKeys(Keys.ARROW_DOWN);
		SelectFundCatogory.sendKeys(Keys.ARROW_DOWN);
		// SelectFundCatogory.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		SelectFundCatogory.sendKeys(Keys.ENTER);
		SelectFundSIp.click();
		SelectFundSIp.sendKeys("Liquid");
		Thread.sleep(3000);
		SelectFundSIp.sendKeys(Keys.ARROW_DOWN);
		SelectFundSIp.sendKeys(Keys.ARROW_DOWN);
		SelectFundSIp.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SelectFundSIp.sendKeys(Keys.ENTER);

		SchemeOpionsosip.sendKeys("Growth");
		Thread.sleep(3000);
		SchemeOpionsosip.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SchemeOpionsosip.sendKeys(Keys.ENTER);
		sipInstallmentAmount.sendKeys("1");
		ProceedtoPaymentButtonForPurchase.click();
	}

	public void setOTPintoOTPfield(String Subjectt) throws InterruptedException {

		Thread.sleep(3000);
		String otp = Utilities.getOtp(Subjectt);
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

	}

	public void setOTPintoOTPfieldForSIP(String Subjectt) throws InterruptedException {

		Thread.sleep(3000);
		String otp = Utilities.getOtp(Subjectt);
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

		OTPInputfieldforSip1.sendKeys(p);
		Thread.sleep(3000);
		System.out.println(a);
		OTPInputfieldforSip2.sendKeys(q);
		Thread.sleep(3000);
		System.out.println(b);
		OTPInputfieldforSip3.sendKeys(r);
		Thread.sleep(3000);
		System.out.println(c);
		OTPInputfieldforSip4.sendKeys(s);
		Thread.sleep(3000);
		System.out.println(d);
		Thread.sleep(3000);
		OTPInputfieldforSip5.sendKeys(t);
		Thread.sleep(3000);
		System.out.println(e);
		OTPInputfieldforSip6.sendKeys(u);
		Thread.sleep(3000);
		System.out.println(f);
		Thread.sleep(3000);
		CheckBox.click();
		Thread.sleep(3000);

	}

	public void setRedeemTxnIDIntoExcel() throws InterruptedException, IOException {
		continueButton3.click();
		Thread.sleep(5000);
		
		String redeentxnId = RedeemtxnID.getText();
		System.out.println(redeentxnId);
		
		
		try {
			WriteDataIntoExcel.EnterDataIntoSpeciedRowColomn(
					"D:\\Hybrid TestNG Framework\\IciciPruNew\\src\\main\\java\\com\\iciciprunew\\qa\\testdata\\transaction.xlsx",
					"Txn", 0, 1, redeentxnId);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

	public void setSwitchTxnIDIntoExcel() throws InterruptedException {
		continueButtonSwitch2.click();
		Thread.sleep(3000);
		String switchtxnId = SwitchtxnID.getText().toString();
		System.out.println(switchtxnId);
		Thread.sleep(3000);

		try {
			WriteDataIntoExcel.EnterDataIntoSpeciedRowColomn(
					"D:\\Hybrid TestNG Framework\\IciciPruNew\\src\\main\\java\\com\\iciciprunew\\qa\\testdata\\transaction.xlsx",
					"Txn", 1, 0, switchtxnId);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

	public void setsipTxnIDIntoExcel() throws InterruptedException {
		coninueButtonForSip.click();
		Thread.sleep(3000);
		ProceedtoPaymentButtonForSip.click();

	}

	public void setPurchaseTxnIDIntoExcel() throws InterruptedException {
		coninueButtonForPurchase.click();
		Thread.sleep(3000);
		ProceedtoPaymentButtonForSip.click();

	}
}
