package com.iciciprunew.qa.utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtentReporter2 {

	/*
	 * public static WebDriver driver;
	 * 
	 * public static void main(String[] args) throws IOException {
	 * 
	 * CreateTest(); }
	 */

	public static ExtentReports CreateTest(WebDriver driver) throws IOException {

		/*
		 * System.out.println("hi2"); ExtentReports extent2 = new ExtentReports();
		 * 
		 * File file2 = new File(
		 * "D:\\Hybrid TestNG Framework\\IciciPruNew\\test-output\\ExtentReports\\extentRport2.html"
		 * );
		 * 
		 * ExtentSparkReporter sparkReporter2 = new ExtentSparkReporter(file2);
		 * extent2.attachReporter(sparkReporter2);
		 */

		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		
		return new ExtentReports();
		/*
		 * System.out.println("hi3"); ExtentTest test2 = extent2.createTest("testName");
		 * test2.log(Status.INFO, logInfo); System.out.println("hi4");
		 * test2.log(Status.INFO, com.aventstack.extentreports.MediaEntityBuilder
		 * .createScreenCaptureFromBase64String(((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.BASE64), screenShotName).build());
		 * 
		 * System.out.println("hi5"); extent2.flush(); // driver.quit();
		 * //Desktop.getDesktop().browse(file2.toURI());
		 */
	}

	/*
	 * public static String takeScreenshotanndreturnPath() throws IOException {
	 * 
	 * File sourceScreenshotFile = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); File destinationScreenshotFile=new
	 * File("D:\\Hybrid TestNG Framework\\IciciPruNew\\Screenshots\\homepage8.png");
	 * FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile); return
	 * destinationScreenshotFile.getAbsolutePath(); }
	 */

	/*
	 * public static String takeScreenshot() {
	 * 
	 * System.out.println("hi5"); String base64Screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BASE64); System.out.println("hi6"); return
	 * base64Screenshot;
	 * 
	 * }
	 */
	 
}
