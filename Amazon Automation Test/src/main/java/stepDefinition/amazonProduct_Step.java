package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjectModel.AmazonPage;

public class amazonProduct_Step {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Go to Amazon.com")
    public void go_to_amazon_com() {
        amazonPage.NavigateAmazon();
        System.out.println("Navigate to Amazon.com");
    }

    @Given("Click All Category Menu")
    public void click_all_category_menu() {
        amazonPage.ClickMenu();
        System.out.println("Click All Category Menu");
    }

    @Given("Click Computer")
    public void click_computer() {
        amazonPage.ClickComputerCategory();
        System.out.println("Click Computer Category");
    }

    @Given("Click Data Storge")
    public void click_data_storge() {
        amazonPage.ClickDataStorageCategory();
        System.out.println("Click Data Storge");
    }

    @Given("Click USB Flash Drives from the left menu")
    public void click_from_the_left_menu() {
        amazonPage.ClickUsbFlashDrivesCategory();
        System.out.println("Click USB Flash Drives from the left menu");
    }

    @Given("Capacity 64GB is selected in the filter section")
    public void capacity_64gb_is_selected_in_the_filter_section() {
        amazonPage.Select64GbFilter();
        System.out.println("Capacity 64GB is selected in the filter section");
    }

    @Given("Seller selecting as Amazon.com")
    public void seller_selecting_as_amazon_com() {
        amazonPage.SelectSellerAmazonCom();
        System.out.println("Seller selecting as Amazon.com");
    }

    @Given("If the product is under 20 dollars, it is entered and added to the cart")
    public void ıf_the_product_is_under_dollars_it_is_entered_and_added_to_the_cart(){
        amazonPage.ClickProductAndAddToCartButton();
        System.out.println("If the product is under 20 dollars, it is entered and added to the cart");
    }

    @When("By going to cart")
    public void by_going_to_cart() {
        amazonPage.ClickNavCartButton();
        System.out.println("By going to cart");
    }

    @Then("The product price is verifying")
    public void the_product_price_is_verifying() {
        Assert.assertTrue(amazonPage.productPriceIsVeriyfing() < amazonPage._usbFlashDriveFee);
        System.out.println("Message: Test Successful");
    }
}
