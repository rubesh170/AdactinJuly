package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement searchinghotel;

	@FindBy(className = "reg_button")
	private WebElement continuebtn;

	public Select_Hotel(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver3, this);
	}

	public WebElement getSearchbtn() {
		return searchinghotel;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
