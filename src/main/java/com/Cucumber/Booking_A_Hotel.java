package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_A_Hotel {
	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement getAddress;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getGetAddress() {
		return getAddress;
	}

	public WebElement getGetCardno() {
		return getCardno;
	}

	public WebElement getGetCardtype() {
		return getCardtype;
	}

	public WebElement getGetCardexp_month() {
		return getCardexp_month;
	}

	public WebElement getGetCardexp_year() {
		return getCardexp_year;
	}

	public WebElement getGetCvv() {
		return getCvv;
	}

	public WebElement getGetBooknowbtn() {
		return getBooknow;
	}

	@FindBy(id = "cc_num")
	private WebElement getCardno;
	@FindBy(id = "cc_type")
	private WebElement getCardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement getCardexp_month;
	@FindBy(id = "cc_exp_year")
	private WebElement getCardexp_year;
	@FindBy(id = "cc_cvv")
	private WebElement getCvv;
	@FindBy(id = "book_now")
	private WebElement getBooknow;

	public Booking_A_Hotel(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver4, this);
	}
}
