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
		//driver.quit();

	}

	@Test
	public void RedeemTrxn() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		TransactionPage transactionPage = new TransactionPage(driver);
		transactionPage.redeemTrxn();
		// Thread.sleep(1000);
		transactionPage.setOTPintoOTPfield();

	}
	
	
	
	
	@Test
	public void SwichTxn() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		TransactionPage transactionPage = new TransactionPage(driver);
		transactionPage.switchTrxn();

	}
	
	

}
