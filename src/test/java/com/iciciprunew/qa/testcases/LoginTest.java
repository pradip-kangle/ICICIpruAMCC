package com.iciciprunew.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iciciprunew.qa.base.BaseClass;
import com.iciciprunew.qa.pages.HomePage;

public class LoginTest extends BaseClass {

	public WebDriver driver;

	public LoginTest() {

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

	/*
	 * @Test public void verifyLoginWithValidCredentialsWithPropFile() throws
	 * InterruptedException {
	 * 
	 * 
	 * }
	 * 
	 */

	@Test
	public void Login() throws InterruptedException {
		System.out.println("Hi");
		String actualTexttext = driver
				.findElement(By.xpath("//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span"))
				.getText();
		System.out.println(actualTexttext);
		String expected = "Hello1";

		Assert.assertEquals(actualTexttext, expected, "different");

	}

	@Test
	public void Login2() throws InterruptedException {

		String actualTexttext = driver
				.findElement(By.xpath("//h3[@class='MuiTypography-root MuiTypography-h3 Bold css-18h9l83']/span"))
				.getText();
		System.out.println(actualTexttext);
		String expected = "Hello";

		Assert.assertEquals(actualTexttext, expected, "different");

	}

	/*
	 * @DataProvider(name = "validCredentialsSupplier") public Object[][]
	 * SupplyTestData() {
	 * 
	 * Object[][] data = Utilities.getDataFromExcel("Login"); return data; }
	 * 
	 * //@Test(dataProvider = "validCredentialsSupplier") public void
	 * verifyLoginWithValidCredentialsWithExcelFile(String email, String password)
	 * throws InterruptedException {
	 * 
	 * // System.out.println(Utilities.usernamee);
	 * 
	 * HomePage homePage = new HomePage(driver); homePage.SignInAccount(email,
	 * password); System.out.println("done");
	 * 
	 * }
	 */

}
