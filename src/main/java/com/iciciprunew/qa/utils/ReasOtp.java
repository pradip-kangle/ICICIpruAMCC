package com.iciciprunew.qa.utils;

import javax.mail.*;
import javax.mail.internet.ContentType;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;
import java.io.IOException;
import java.util.Properties;

public class ReasOtp {
	private final static String host = "imap.gmail.com";
	private final static String mailStoreType = "imaps";
	private final static String port = "993";

	private final static String email = "pradipkangale198@gmail.com";

	private final static String password = "vrzh uyve ipht rpdh";

	public static void main(String[] args) {

		
		String otp = getOtp();
		System.out.println(otp);
	}

	public static String getOtp() {
		try {
			String otp = "";

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

			Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
			System.out.println("hi");
			for (Message singleMessage : messages) {
				System.out.println("hi2");
				if (singleMessage.getSubject().equals("One Time Password")) {

					System.out.println("hi3");
					singleMessage.setFlag(Flags.Flag.SEEN, true);
					
					Object content = singleMessage.getContent().toString();

					System.out.println(content.toString());

					String otpPhrase = "Your One Time Password (OTP) is ";

					int indexOfOtpStart = content.toString().indexOf(otpPhrase) + otpPhrase.length();

					otp = otp + content.toString().substring(indexOfOtpStart, indexOfOtpStart + 5);
					

					break;
				}

			}
			inbox.close(false);
			store.close();

			return otp;
		} catch (Exception e) {
			throw new RuntimeException("There are problems with reading emails.");
		}
	}

}