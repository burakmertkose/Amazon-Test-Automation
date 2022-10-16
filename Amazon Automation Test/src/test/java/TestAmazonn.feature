Feature: Welcome The Amazon Test

  Scenario: Go to the Amazon.com and All category listed. Computer > Storge Clicked.

    Given Go to Amazon.com
    And Click All Category Menu
    And Click Computer
    And Click Data Storge
    And Click USB Flash Drives from the left menu
    And Capacity 64GB is selected in the filter section
    And Seller selecting as Amazon.com
    And If the product is under 20 dollars, it is entered and added to the cart
    When By going to cart
    Then The product price is verifying