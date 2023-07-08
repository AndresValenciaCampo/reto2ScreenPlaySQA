Feature: Add Product to Shopping Cart
  As a customer
  I want to search for a product, select it, and add it to the shopping cart
  So that I can make a successful purchase


  Scenario: Add product to cart success
    Given the user is in the homepage and enter product in the search bar
    When the user select a random product from the results list and add units of the same product
    And  the user click on add to cart button
    Then the product name and the units in the shopping cart should be the same from the description page
