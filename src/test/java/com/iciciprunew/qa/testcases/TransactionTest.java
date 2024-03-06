package com.iciciprunew.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iciciprunew.qa.base.BaseClass;
import com.iciciprunew.qa.pages.DashboardPage;
import com.iciciprunew.qa.pages.HomePage;
import com.iciciprunew.qa.pages.TransactionPage;
import com.iciciprunew.qa.utils.Utilities;

public class TransactionTest extends BaseClass {

	public WebDriver driver;
	HomePage homePage;
	DashboardPage dashboardPage;
	TransactionPage transactionPage;
	Utilities utilities;

	public TransactionTest() {

		super();
	}

	@BeforeMethod
	public void setup() {
		driver = initiaseBrowserAndOpenApplication(prop.getProperty("browser"));

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

	@Test
	public void RedeemTrxn() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage= new TransactionPage(driver);
		transactionPage.redeemTrxn();
		// Thread.sleep(1000);
		transactionPage.setOTPintoOTPfield("Redeem transaction OTP");
		transactionPage.setRedeemTxnIDIntoExcel();
	}

	@Test
	public void SwichTxn() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.switchTrxn();
		transactionPage.setOTPintoOTPfield("Switch transaction OTP");
		transactionPage.setSwitchTxnIDIntoExcel();
	}
	
	
	@Test
	public void SIPTxn() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.sipTxn();
		transactionPage.setOTPintoOTPfieldForSIP("SIP Purchase Transaction OTP");
		transactionPage.setsipTxnIDIntoExcel();
	}
	
	
	@Test
	public void Purchase() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.PurchaseTxn();
		transactionPage.setOTPintoOTPfieldForSIP("Purchase Transaction OTP");
		transactionPage.setPurchaseTxnIDIntoExcel();
		
		
	}
}
