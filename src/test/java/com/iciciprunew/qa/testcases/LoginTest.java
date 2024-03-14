package com.iciciprunew.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.iciciprunew.qa.base.BaseClass;
import com.iciciprunew.qa.pages.HomePage;
import com.iciciprunew.qa.utils.ExtentReporter2;
import com.iciciprunew.qa.utils.Utilities;

public class LoginTest extends BaseClass {

	public WebDriver driver;

	public LoginTest() {

		super();
	}

	 @BeforeMethod
		public void setup() throws IOException, InterruptedException {
			driver = initiaseBrowserAndOpenApplication(prop.getProperty("browser"));

		}
	 

	/*
	 * @AfterMethod public void tearDown() { // driver.quit(); }
	 */

	/*
	 * @Test public void verifyLoginWithValidCredentialsWithPropFile() throws
	 * InterruptedException {
	 * 
	 * 
	 * }
	 * 
	 */

	@Test
	public void Login() throws InterruptedException, IOException {
		test = extent.createTest("functionality1Test1","This test represents the user is logging using valid usernaame & password");
        //Assert.assertTrue(1 > 0);
		System.out.println("Hi");
		String actualTexttext = driver
				.findElement(By.xpath("//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span"))
				.getText();
		System.out.println("Hi2");
		System.out.println(actualTexttext);
		test.log(Status.INFO, "User logged in & Navigated to dashBord Page successfully..");
		System.out.println("hi4");
		  
		test.log(Status.INFO, com.aventstack.extentreports.MediaEntityBuilder
		  .createScreenCaptureFromBase64String(((TakesScreenshot)
		  driver).getScreenshotAs(OutputType.BASE64), "DashboardPage").build());
		String expected = "Hello";
		System.out.println("Hi2");
		Assert.assertEquals(actualTexttext, expected, "different");

	}
	/*
	 * @Test public void Login2() throws InterruptedException, IOException { test =
	 * extent.createTest("functionality1Test1"); // Assert.assertTrue(1 > 0); String
	 * actualTexttext = driver .findElement(By.
	 * xpath("//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span"
	 * )) .getText(); System.out.println(actualTexttext); String expected = "Hello";
	 * 
	 * Assert.assertEquals(actualTexttext, expected, "different");
	 * Thread.sleep(5000); //ExtentReporter2.CreateTest(driver);
	 * 
	 * }
	 */

	/*
	 * @DataProvider(name = "validCredentialsSupplier") public Object[][]
	 * SupplyTestData() {
	 * 
	 * Object[][] data = Utilities.getTestDataFromExcel("Login");
	 * 
	 * return data; }
	 * 
	 * @Test(dataProvider = "validCredentialsSupplier") public void
	 * LoginWithExcelFile(String email, String password) throws InterruptedException
	 * {
	 * 
	 * HomePage homePage = new HomePage(driver); homePage.SignInAccount(email,
	 * password); System.out.println("done");
	 * 
	 * }
	 */

}
