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
-    And If the product is under 10 dollars, it is entered and added to the cart
-    When By going to cart
-    Then The product price is verifying



### Click All Category Menu
![](https://i.ibb.co/18BPRSj/Screenshot-2.png)

### Click Computer
![](https://i.ibb.co/xMkCbGd/Screenshot-3.png)

### Click Data Storge
![](https://i.ibb.co/Smr8TSD/Screenshot-4.png)

### Click USB Flash Drives from the left menu
![](https://i.ibb.co/jG8LHTm/Screenshot-5.png)

### Capacity 64GB is selected in the filter section
![](https://i.ibb.co/BwHytS4/Screenshot-6.png)


### Seller selecting as Amazon.com
![](https://i.ibb.co/YkjN6wT/Screenshot-7.png)


### If the product is under 10 dollars, it is entered and added to the cart
![](https://i.ibb.co/mTrSCQC/Screenshot-8.png)
![](https://i.ibb.co/18QpK6d/Screenshot-9.png)


### By going to cart and The product price is verifying
![](https://i.ibb.co/CvLnp3S/Screenshot-10.png)


### Output Scenario
![](https://i.ibb.co/LYphqSD/Screenshot-11.png)






