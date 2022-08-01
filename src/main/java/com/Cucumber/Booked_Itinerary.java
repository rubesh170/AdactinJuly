package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public static WebDriver driver;

	@FindBy(id = "c")
	private WebElement orderid;

	@FindBy(name = "search_hotel_id")
	private WebElement search;

	@FindBy(id = "ids[]")
	private WebElement checkbox;

	@FindBy(id = "logout")
	private WebElement logout;

	public Booked_Itinerary(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver5, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLogout() {
		return logout;
	}

}
