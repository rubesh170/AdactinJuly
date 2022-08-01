Feature: Hotel booking with adactin Functionality

Scenario: checking login functionality
Given  user launches the application
When user enters the username in username field
And user enters the password in password field
Then user clicks the login button and navigates to search Hotelpage

Scenario: search hotel Functionality
When user selects the location from the dropdown
And user selects the hotel from the dropdown
And user selects the roomtype from the dropdown
And  user selects the number of rooms from the dropdown
And user selects the checkindate
And user selects the checkoutdate
And user selects the adults per room
And user selects the children per room
Then user clicks the searchButton and user navigates to the SelectHotelPage

Scenario: select hotel functionality
When user select the hotel by click
Then  user clicks the continuebutton and user navigates to the BookAHotelPage

Scenario: Select book a hotel functionality
When user enters the first name in First Name field
And user enters the last name in Last Name field
And user enters the billing address in Billing Address field
And user enters the credit card number in Credit Card Number field
And user enters the credit card type in card type field
And user selects the credit card expiry month in Expiry date field from the dropdown
And user selects the  credit card expity year in Expiry date field from the dropdown
And user enters the credit card cvv number in CVV Number field
Then user clicks the continueButton and user navigates to the BookingConfirmationPage

Scenario: Checking Booking Confirmationpage functionality
When user clicks the Booked Itinerary and user navigates to the BookedItineraryPage


Scenario: Search OrderId in ItineraryPage functionality
When user enters the order id in search fields 
And user clicks the go menu field and search orders
And user selects the icon from radiobutton field and user logout the BookedItineraryPages







