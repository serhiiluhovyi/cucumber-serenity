Feature: As a user I want to add product to the cart

  @P110
  Scenario: Add product to the cart
    Given I open Web Shop homepage
    And I click on Books Category
    When I add to cart the first book
    Then I click on the shopping cart
    And I check that book is in the cart

  @P111
  Scenario: Add two different product to the cart
    Given I open Web Shop homepage
    And I click on Books Category
    When I add to cart the fifth book
    And I click on Jewelry Category
    And I add to cart the second jewelry
    Then I click on the shopping cart
    And I check the quantity 2 of the product
