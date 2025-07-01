# language: en

Feature: Recommended Items Functionality

  As a user,
  I want to be able to add recommended items to my cart
  to easily purchase products suggested by the store.

  @AddToCart
  Scenario: Add a recommended item to the shopping cart
    Given the user is on the Automation Exercise home page
    When the user scrolls down to the recommended items section
    And the user adds the "Men Tshirt" recommended product to the cart
    And the user clicks on the 'View Cart' button in the confirmation modal
    Then the user should see "Men Tshirt" displayed in the cart page