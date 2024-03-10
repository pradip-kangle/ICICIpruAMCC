package com.iciciprunew.qa.utils;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingFullScreenshot {

	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.tradingview.com/");
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenFullImage = new Robot().createScreenCapture(screenRect);
		ImageIO.write(screenFullImage, "png", new File("D:\\Hybrid TestNG Framework\\IciciPruNew\\Screenshots\\FILENAME3.png"));
	}

}
