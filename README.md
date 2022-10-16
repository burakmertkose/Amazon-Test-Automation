# Amazon-Test-Automation


It is a test automation sample project developed using Selenium WebDriver in Java language. 

**Used in the project:** `Selenium Webdriver` `Cucumber` `JUnit`

## Automation Test Scenario

By going to Amazon.com. Go to Menu > Computer > Storge Data category and go to Usb Flash Drives section. It selectively filters 64GB USB Flash drives from Amazon.com. Then it scans all the products and adds the USB Flash Drive under $10 to the cart. At the end of the test, the price of the added product is verified by going to the basket.

-    Given Go to Amazon.com
-    And Click All Category Menu
-    And Click Computer
-    And Click Data Storge
-    And Click USB Flash Drives from the left menu
-    And Capacity 64GB is selected in the filter section
-    And Seller selecting as Amazon.com
-    And If the product is under 20 dollars, it is entered and added to the cart
-    When By going to cart
-    Then The product price is verifying

![](https://i.ibb.co/wQrMQDX/Screenshot-1.png)
