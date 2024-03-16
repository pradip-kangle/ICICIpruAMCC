package com.iciciprunew.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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
	public void setup() throws IOException, InterruptedException {
		driver = initiaseBrowserAndOpenApplication(prop.getProperty("browser"));
		

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

	@Test
	public void RedeemTrxn() throws InterruptedException, IOException {
		test = extent.createTest("RedeemTrxn","This test represents the user is logging using valid usernaame & password");
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		
		transactionPage= new TransactionPage(driver);
		transactionPage.redeemTrxn();
		// Thread.sleep(1000);
		transactionPage.setOTPintoOTPfield("Redeem transaction OTP");
		transactionPage.setRedeemTxnIDIntoExcel();
		Thread.sleep(5000);
		//ExtentReports extent2 = ExtentReporter2.CreateTest(driver);
		File file2 = new File(
				"D:\\Hybrid TestNG Framework\\IciciPruNew\\test-output\\ExtentReports\\extentRport2.html");

		ExtentSparkReporter sparkReporter2 = new ExtentSparkReporter(file2);
		//extent2.attachReporter(sparkReporter2);
		/*
		 * ExtentTest test2 = extent2.createTest("RedeemTrxn");
		 * 
		 * test2.log(Status.INFO, "logInfo"); System.out.println("hi4");
		 * 
		 * test2.log(Status.INFO, com.aventstack.extentreports.MediaEntityBuilder
		 * .createScreenCaptureFromBase64String(((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.BASE64), "screenShotName").build());
		 */
		//extent2.flush();
	}

	@Test
	public void SwichTxn() throws InterruptedException {
		test = extent.createTest("SwichTxn","This test represents the user is logging using valid usernaame & password");
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.switchTrxn();
		transactionPage.setOTPintoOTPfield("Switch transaction OTP");
		transactionPage.setSwitchTxnIDIntoExcel();
	}
	
	
	@Test
	public void SIPTxn() throws InterruptedException {
		test = extent.createTest("SIPTxn","This test represents the user is logging using valid usernaame & password");
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.sipTxn();
		transactionPage.setOTPintoOTPfieldForSIP("SIP Purchase Transaction OTP");
		transactionPage.setsipTxnIDIntoExcel();
	}
	
	
	@Test
	public void Purchase() throws InterruptedException {
		test = extent.createTest("Purchase","This test represents the user is logging using valid usernaame & password");
		dashboardPage = new DashboardPage(driver);
		dashboardPage = new DashboardPage(driver);
		dashboardPage.clickOnnewTransactionButton();
		transactionPage = new TransactionPage(driver);
		transactionPage.PurchaseTxn();
		transactionPage.setOTPintoOTPfieldForSIP("Purchase Transaction OTP");
		transactionPage.setPurchaseTxnIDIntoExcel();
		
		
	}
}
