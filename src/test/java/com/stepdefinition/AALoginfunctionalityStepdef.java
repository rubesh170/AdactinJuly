package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber.Base_Class;
import com.Cucumber.PageObjectManager;
import com.Runner.TestRunner;
import com.config.helper.FileReadermanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AALoginfunctionalityStepdef extends Base_Class {
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("user launches the application")
	public void user_launches_the_application() throws Throwable {
		String urlname = FileReadermanager.getInstanceFRM().getInstanceCR().getUrl();
		System.out.println("urlname "+urlname);
		geturl(urlname);
	}

	@When("user enters the username in username field")
	public void user_enters_the_username_in_username_field() throws Throwable {
		inputValueElement(pom.getLoginPage().getUsername(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getUsername());

	}

	@When("user enters the password in password field")
	public void user_enters_the_password_in_password_field() throws Throwable {
		inputValueElement(pom.getLoginPage().getPassword(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getPassword());

	}

	@Then("user clicks the login button and navigates to search Hotelpage")
	public void user_clicks_the_login_button_and_navigates_to_search_hotelpage() throws Throwable {
		clickOnElement(pom.getLoginPage().getLoginbtn());
	}

	@When("user selects the location from the dropdown")
	public void user_selects_the_location_from_the_dropdown() throws Throwable {
		System.out.println("location "+pom.getSearch_Hotel().getLocation());
	//	dropdown(pom.getSearch_Hotel().getLocation(), "select by value", "paris");
	//	dropdown(pom.getSearch_Hotel().getLocation(), "value", "paris");
		dropdown(pom.getSearch_Hotel().getLocation(), "value", "Paris");
//		WebElement location=driver.findElement(By.id("location"));
//		dropdown(location, "value", "Paris");
		Thread.sleep(2000);

	}

	@When("user selects the hotel from the dropdown")
	public void user_selects_the_hotel_from_the_dropdown() throws Throwable {
		dropdown(pom.getSearch_Hotel().getHotel(), "value ", "Hotel Sunshine");
//		WebElement shotel=driver.findElement(By.id("hotels"));
//		dropdown(shotel, "value", "Hotel Sunshine");

	}

	@When("user selects the roomtype from the dropdown")
	public void user_selects_the_roomtype_from_the_dropdown() throws Throwable {
		dropdown(pom.getSearch_Hotel().getRoom_type(), "value", "Super Deluxe");

	}

	@When("user selects the number of rooms from the dropdown")
	public void user_selects_the_number_of_rooms_from_the_dropdown() throws Throwable {
		dropdown(pom.getSearch_Hotel().getRoom_nos(), "value", "5");

	}

	@When("user selects the checkindate")
	public void user_selects_the_checkindate() throws Throwable {
	//	dropdown(pom.getSearch_Hotel().getDatepick(), "26/07/2022", null);
		WebElement checkInDate=driver.findElement(By.id("datepick_in"));
		checkInDate.clear();
		inputValueElement(checkInDate, "02/08/2022");
	}

	@When("user selects the checkoutdate")
	public void user_selects_the_checkoutdate() throws Throwable {
	//	dropdown(pom.getSearch_Hotel().getDatepick_out(), "30/07/2022", null);
		WebElement checkOutDate=driver.findElement(By.id("datepick_out"));
		checkOutDate.clear();
		inputValueElement(checkOutDate, "05/08/2022");
		Thread.sleep(2000);
	}

	@When("user selects the adults per room")
	public void user_selects_the_adults_per_room() throws Throwable {
		dropdown(pom.getSearch_Hotel().getAdultroom(), "select by value", "2");
		Thread.sleep(2000);
	}

	@When("user selects the children per room")
	public void user_selects_the_children_per_room() throws Throwable {
		dropdown(pom.getSearch_Hotel().getChildroom(), "select by value", "3");
		Thread.sleep(2000);
	}

	@Then("user clicks the searchButton and user navigates to the SelectHotelPage")
	public void user_clicks_the_search_button_and_user_navigates_to_the_select_hotel_page() throws Throwable {
		clickOnElement(pom.getSearch_Hotel().getSubmitbtn());
		Thread.sleep(2000);
	}

	@When("user select the hotel by click")
	public void user_select_the_hotel_by_click() throws Throwable {
		clickOnElement(pom.getSelect_Hotel().getSearchbtn());

	}

	@Then("user clicks the continuebutton and user navigates to the BookAHotelPage")
	public void user_clicks_the_continuebutton_and_user_navigates_to_the_book_a_hotel_page() throws Throwable {
		clickOnElement(pom.getSelect_Hotel().getContinuebtn());

	}

	@When("user enters the first name in First Name field")
	public void user_enters_the_first_name_in_first_name_field() throws Throwable {
		inputValueElement(pom.getBooking_A_Hotel().getFirstName(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getFirstName());

	}

	@When("user enters the last name in Last Name field")
	public void user_enters_the_last_name_in_last_name_field() throws Throwable {
		inputValueElement(pom.getBooking_A_Hotel().getLastName(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getLastName());

	}

	@When("user enters the billing address in Billing Address field")
	public void user_enters_the_billing_address_in_billing_address_field() throws Throwable {
		inputValueElement(pom.getBooking_A_Hotel().getGetAddress(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getAddress());

	}

	@When("user enters the credit card number in Credit Card Number field")
	public void user_enters_the_credit_card_number_in_credit_card_number_field() throws Throwable {
		inputValueElement(pom.getBooking_A_Hotel().getGetCardno(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getCardNumber());

	}

	@When("user enters the credit card type in card type field")
	public void user_enters_the_credit_card_type_in_card_type_field() throws Throwable {
		dropdown(pom.getBooking_A_Hotel().getGetCardtype(), "select by value", "Visa");

	}

	@When("user selects the credit card expiry month in Expiry date field from the dropdown")
	public void user_selects_the_credit_card_expiry_month_in_expiry_date_field_from_the_dropdown() throws Throwable {
		dropdown(pom.getBooking_A_Hotel().getGetCardexp_month(), "select by value", "November");

	}

	@When("user selects the  credit card expity year in Expiry date field from the dropdown")
	public void user_selects_the_credit_card_expity_year_in_expiry_date_field_from_the_dropdown() throws Throwable {
		dropdown(pom.getBooking_A_Hotel().getGetCardexp_year(), "select by value", "2022");

	}

	@When("user enters the credit card cvv number in CVV Number field")
	public void user_enters_the_credit_card_cvv_number_in_cvv_number_field() throws Throwable {
		inputValueElement(pom.getBooking_A_Hotel().getGetCvv(),
				FileReadermanager.getInstanceFRM().getInstanceCR().getCardCvv());

	}

	@Then("user clicks the continueButton and user navigates to the BookingConfirmationPage")
	public void user_clicks_the_continue_button_and_user_navigates_to_the_booking_confirmation_page() throws Throwable {
		clickOnElement(pom.getBooking_A_Hotel().getGetBooknowbtn());
	}

	@When("user clicks the Booked Itinerary and user navigates to the BookedItineraryPage")
	public void user_clicks_the_booked_itinerary_and_user_navigates_to_the_booked_itinerary_page() throws Throwable {
		clickOnElement(pom.getBookingConfirmation().getMyitinerarybtn());

	}

//	@When("user enters the order id in search field")
//	public void user_enters_the_order_id_in_search_field() throws Throwable {
//		inputValueElement(pom.getBooked_Itinerary().getOrderid(),
//				FileReadermanager.getInstanceFRM().getInstanceCR().getOrderId());
//	}
//
//	@When("user clicks the go menu field and search order")
//	public void user_clicks_the_go_menu_field_and_search_order() throws Throwable {
//		clickOnElement(pom.getBooked_Itinerary().getSearch());
//	}
//
//	@When("user selects the icon from radiobutton field and user logout the BookedItineraryPage")
//	public void user_selects_the_icon_from_radiobutton_field_and_user_logout_the_booked_itinerary_page()
//			throws Throwable {
//		clickOnElement(pom.getBooked_Itinerary().getCheckbox());
//
//	}

}
