package com.config.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
//1.crerate a constructor

	public Properties p;

	public ConfigurationReader() throws Throwable {

//		File f = new File(
//				"C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\config\\helper\\ConfigurationReader.java");
		
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\config\\ConfigurationProperty.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		// f=key and value pair read and store in property class
		p.load(fis);
	}

	// public void getUrl()
	public String getUrl() {
//		p.getProperty("url")= taking return type and convert into string type
		String url = p.getProperty("url");
		System.out.println("url in config "+url);
		return url;// changing return by converting void into string
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getFirstName() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}

	public String getLastName() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getCardNumber() {
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;
	}
//			public String getCardExpiryType() {
//				String cardtype = p.getProperty("cardtype");
//				return cardtype;
//			}

	public String getCardCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}

	public String getOrderId() {
		String orderid = p.getProperty("getOrderId");
		return orderid;
	}

}
