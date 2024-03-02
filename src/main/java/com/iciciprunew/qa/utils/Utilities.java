package com.iciciprunew.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.ContentType;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {
	

	static String result = "";
	static String messageBody = "";

	private final static String host = "imap.gmail.com";
	private final static String mailStoreType = "imaps";
	private final static String port = "993";
	// email is your email address where email with OTP is sent
	private final static String email = "pradipkangale198@gmail.com";
	// password is app password created for the email address above
	private final static String password = "vrzh uyve ipht rpdh";


	public static String getOtp() {
		try {
			String otp = "";

			// delay to let backend sends email with OTP
			Thread.sleep(10000);

			Properties properties = new Properties();
			properties.put("mail.imap.host", host);
			properties.put("mail.imap.port", port);
			properties.put("mail.imap.starttls.enable", "true");
			properties.put("mail.imap.ssl.trust", host);

			Session emailSession = Session.getDefaultInstance(properties);
			Store store = emailSession.getStore(mailStoreType);
			store.connect(host, email, password);

			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_WRITE);
			// all unread emails from Inbox folder is to be in the messages array
			Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));

			// go through all the messages
			for (Message singleMessage : messages) {
				System.out.println("hi");
				// find a message with the same Subject as emails with OTP usually have
				if (singleMessage.getSubject().equals("Redeem transaction OTP"))

					System.out.println("hi2");
				{
					System.out.println("hi3");
					singleMessage.setFlag(Flags.Flag.SEEN, true);
					System.out.println("hi4");
					String messageBody = getMessageBody(singleMessage);
					System.out.println("hi5");
					String otpPhrase = "Greetings from ICICI Prudential Mutual Fund!";
					System.out.println(otpPhrase.length());
					System.out.println("hi6");
					System.out.println(singleMessage.getContent().toString());
					System.out.println(messageBody.toString());
					// find index inside the message body where OTP is written

					System.out.println(messageBody.charAt(18));
					int indexOfOtpStart = messageBody.indexOf(otpPhrase) + otpPhrase.length();
					// 64 20 44
					System.out.println("hi7");

					otp = otp + messageBody.substring(indexOfOtpStart + 1, indexOfOtpStart + 7);
					System.out.println("hi8");
				}
			}
			inbox.close(false); // 66 5
			store.close();

			return otp;
		} catch (Exception e) {
			throw new RuntimeException("There are problems with reading emails.");
		}
	}
	
	
	
	private static String getMessageBody(Message message) throws MessagingException, IOException {

		if (message.isMimeType("text/plain")) {
			messageBody = message.getContent().toString();
		} else if (message.isMimeType("multipart/*")) {
			MimeMultipart mimeMultipart = (MimeMultipart) message.getContent();
			messageBody = getTextFromMimeMultipart(mimeMultipart);
		}
		return messageBody;
	}

	private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws IOException, MessagingException {
		int count = mimeMultipart.getCount();
		if (count == 0)
			throw new MessagingException("Multipart with no body parts not supported.");
		boolean multipartAlt = new ContentType(mimeMultipart.getContentType()).match("multipart/alternative");
		if (multipartAlt)
			return getTextFromBodyPart(mimeMultipart.getBodyPart(count - 1));
		String result = "";
		for (int i = 0; i < count; i++) {
			BodyPart bodyPart = mimeMultipart.getBodyPart(i);
			result += getTextFromBodyPart(bodyPart);
		}
		return result;
	}

	private static String getTextFromBodyPart(BodyPart bodyPart) throws IOException, MessagingException {

		if (bodyPart.isMimeType("text/plain")) {
			result = (String) bodyPart.getContent();
		} else if (bodyPart.isMimeType("text/html")) {
			String html = (String) bodyPart.getContent();
			result = org.jsoup.Jsoup.parse(html).text();
		} else if (bodyPart.getContent() instanceof MimeMultipart) {
			result = getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
		}
		return result;
	}


	
	
	
	
	
	
	
	
public static String captureScreenshot(WebDriver driver,String testName) {
	
	Date date = new Date();
		
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+testName +date.toString().replace(" ","_").replace(":","_")+".png";
		
		try {
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return destinationScreenshotPath;
	}

	
	

	

}
