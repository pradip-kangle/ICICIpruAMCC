package com.iciciprunew.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() {
		
		ExtentReports extentReport1 = new ExtentReports();
		
		File extentReportFile = new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("ICICIPRUAMC Test Automation Results Report");
		sparkReporter.config().setDocumentTitle("IPRU Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport1.attachReporter(sparkReporter);
		
		Properties configProp = new Properties();
		File configPropFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\iciciprunew\\qa\\config\\config.properties");
		
		try {
			FileInputStream fisConfigProp = new FileInputStream(configPropFile);
			configProp.load(fisConfigProp);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		extentReport1.setSystemInfo("Application URL",configProp.getProperty("url"));
		extentReport1.setSystemInfo("Browser Name",configProp.getProperty("browser"));
		extentReport1.setSystemInfo("Email",configProp.getProperty("username"));
		extentReport1.setSystemInfo("Password",configProp.getProperty("password"));
		extentReport1.setSystemInfo("Operating System",System.getProperty("os.name"));
		extentReport1.setSystemInfo("Tester",System.getProperty("user.name"));
		extentReport1.setSystemInfo("Java Version",System.getProperty("java.version"));
		
		return extentReport1;
	}

}
