Feature: register on travel page
  I as a user want to register on the travel page to buy a travel package

  Scenario:  register on travel page
    Given On the main page enter the registration option
    When he mandatory registration data is entered userName:"<leonardo>" and password:"<leonardo1>"
    Then should see a message with your name

