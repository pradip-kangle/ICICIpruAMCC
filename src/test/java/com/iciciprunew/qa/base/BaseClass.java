package com.iciciprunew.qa.base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.iciciprunew.qa.pages.HomePage;
import com.iciciprunew.qa.utils.ExtentReporter2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public BaseClass() {

		prop = new Properties();
		File propFile = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\iciciprunew\\qa\\config\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		} catch (Throwable e) {

			e.printStackTrace();
		}

	}

	@BeforeSuite
	public void setUp() {
		sparkReporter = new ExtentSparkReporter(
				new File("D:\\Hybrid TestNG Framework\\IciciPruNew\\test-output\\ExtentReports\\extentRport2.html"));

		
		  try { sparkReporter.loadXMLConfig(new File(
		  "D:\\Hybrid TestNG Framework\\IciciPruNew\\src\\test\\resources\\config3.xml"
		  )); } catch (IOException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

	public static WebDriver initiaseBrowserAndOpenApplication(String browserName)
			throws IOException, InterruptedException {

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		System.out.println("hi");

		/*
		 * ExtentReports extent1 = ExtentReporter2.CreateTest(driver); File file2 = new
		 * File(
		 * "D:\\Hybrid TestNG Framework\\IciciPruNew\\test-output\\ExtentReports\\extentRport2.html"
		 * );
		 * 
		 * ExtentSparkReporter sparkReporter = new ExtentSparkReporter(new File(
		 * "D:\\Hybrid TestNG Framework\\IciciPruNew\\test-output\\ExtentReports\\extentRport2.html"
		 * )); extent1.attachReporter(sparkReporter); ExtentTest test1 =
		 * extent1.createTest("Login",
		 * "This test represents the user is logging using valid usernaame & password");
		 * test1.log(Status.INFO, "logInfo"); System.out.println("hi4");
		 * 
		 * test1.log(Status.INFO, com.aventstack.extentreports.MediaEntityBuilder
		 * .createScreenCaptureFromBase64String(((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.BASE64), "screenShotName").build());
		 * extent1.flush();
		 */
		// ExtentReporter2.CreateTest(driver,"Login","opened homepage
		// succesfully...","Homepage");
		HomePage homePage = new HomePage(driver);
		homePage.SignInAccount(prop.getProperty("username"), prop.getProperty("password"));
		// ExtentReporter2.CreateTest(driver);

		return driver;

	}

}
