package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	@FindBy(id = "my_itinerary")
	private WebElement myitinerarybtn;
	private WebDriver driver;

	public BookingConfirmation(WebDriver driver6) {
		// TODO Auto-generated constructor stub

		this.driver = driver6;
		PageFactory.initElements(driver6, this);
	}

	public WebElement getMyitinerarybtn() {
		return myitinerarybtn;
	}
}
