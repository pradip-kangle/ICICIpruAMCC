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
		driver.quit();

	}

	
	
	//@Test
	public void RedeemTrxn() throws InterruptedException {

		homePage = new HomePage(driver);
		homePage.SignInAccount(prop.getProperty("username"), prop.getProperty("password"));
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		TransactionPage transactionPage = new TransactionPage(driver);
		transactionPage.redeemTransaction();
		//Thread.sleep(1000);
		transactionPage.setOTPintoOTPfield();

	}

}
