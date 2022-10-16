package pageObjectModel;

import Utillities.Driver;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class AmazonPage extends AbstractClass {
    WebDriver driver;
    WebDriverWait wait;
    public int _usbFlashDriveFee = 10;

    public AmazonPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void NavigateAmazon() {
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
    }


    @FindBy(id = "nav-hamburger-menu")
    private WebElement clickMenuButton;

    public void ClickMenu() {
        webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        try {webDriverWait.until(ExpectedConditions.visibilityOf(clickMenuButton));
        }catch (org.openqa.selenium.TimeoutException x){
            driver.navigate().refresh();
            ClickMenu();}
        elementClick(clickMenuButton);
    }

    @FindBy(xpath = "//div[contains(@class,'hmenu-visible')]")
    private WebElement mainMenuVisible;
    @FindBy(xpath = "//div[contains(@class,'hmenu')]//a/div[contains(.,'Computers')]")
    private WebElement clickComputerCategory;
    public void ClickComputerCategory() {
        webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(mainMenuVisible));
        }catch (org.openqa.selenium.TimeoutException x){
            ClickMenu();}
        elementJavaScriptClick(clickComputerCategory);
    }


    @FindBy(xpath = "//li[contains(.,'Data Storage')]/a")
    private WebElement clickDataStorageCategory;
    public void ClickDataStorageCategory(){
        elementJavaScriptClick(clickDataStorageCategory);
    }

    @FindBy(xpath = "//a[@data-routing='off'][contains(.,'USB Flash Drives')]")
    private WebElement clickUsbFlashDrivesCategory;
    public void ClickUsbFlashDrivesCategory(){
        elementClick(clickUsbFlashDrivesCategory);
    }

    @FindBy(xpath = "//div[@*='filters']//span[contains(.,'64GB')]/a")
    private WebElement select64GbFilter;
    public void Select64GbFilter(){
        elementClick(select64GbFilter);
    }

    @FindBy(xpath = "//div[@*='filters']//span[contains(.,'Amazon.com')]/a")
    private WebElement selectSellerAmazonCom;
    public void SelectSellerAmazonCom(){
        elementClick(selectSellerAmazonCom);
    }



    @FindBy(xpath = "//div[contains(@class,'a-box-group')]//input[contains(@id,'cart')]")
    private WebElement clickAddToCartButton;
    public void ClickProductAndAddToCartButton() {
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'price-whole')])[1]")));
        List<WebElement> feeElements =driver.findElements(By.xpath("//span[contains(@class,'price-whole')]")) ;

        for (WebElement product:feeElements) {
            if (Integer.parseInt(product.getText())<_usbFlashDriveFee)
            {
                elementJavaScriptClick(product);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
                clickAddToCartButton = driver.findElement(By.id("add-to-cart-button"));
                clickAddToCartButton.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("attach-added-to-cart-message")));
                break;
            }
        }
    }


    @FindBy(xpath = "//form[contains(@id,'cart-button')]")
    private WebElement clickNavCartButton;
    public void ClickNavCartButton(){
        elementClick(clickNavCartButton);
    }


    @FindBy(xpath = "//p[@class='a-spacing-mini']")
    private WebElement productPriceBlock; //example: '$9.54'
    public double productPriceIsVeriyfing(){
        webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(15));
        webDriverWait.until(ExpectedConditions.visibilityOf(productPriceBlock));
        String fee = productPriceBlock.getText();
        double price = Double.parseDouble(fee.substring(1));
        return price;
    }

    @After
    public void FinishTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
