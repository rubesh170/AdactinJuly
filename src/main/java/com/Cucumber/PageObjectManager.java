package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	public static WebDriver driver;

	public PageObjectManager(WebDriver r) {
		this.driver = r;
		PageFactory.initElements(r, this);
	}

	// 1.loginpage
	public LoginPage getLoginPage() {
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	// 2.search hotel page
	public Search_Hotel getSearch_Hotel() {
		Search_Hotel sc = new Search_Hotel(driver);
		return sc;
	}

	// 3.select hotel
	public Select_Hotel getSelect_Hotel() {
		Select_Hotel sh = new Select_Hotel(driver);
		return sh;

	}

	// 4.booking a hotel
	public Booking_A_Hotel getBooking_A_Hotel() {
		Booking_A_Hotel bh = new Booking_A_Hotel(driver);
		return bh;

	}

	// 5.booking confirmation
	public BookingConfirmation getBookingConfirmation() {
		BookingConfirmation bc = new BookingConfirmation(driver);
		return bc;

	}

	// 5.booking iternary
	public Booked_Itinerary getBooked_Itinerary() {
		Booked_Itinerary bi = new Booked_Itinerary(driver);
		return bi;
	}

}
