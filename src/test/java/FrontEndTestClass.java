import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class FrontEndTestClass {
    //Set variables
    private  static WebDriver driver;

    public WebElement phoneButton;
    public WebElement monitorButton;
    public WebElement laptopButton;
    public WebElement sonyVaio;
    public WebElement dell;
    public WebElement addToCart;
    public Alert alert;
    String alertText;
    public WebElement homePage;
    public WebElement cartButton;
    public WebElement totalPurchase;
    public WebElement deleteButton;
    public WebElement placeOrder;
    public WebElement nameInput;
    public WebElement countryInput;
    public WebElement cityInput;
    public WebElement cardInput;
    public WebElement monthInput;
    public WebElement yearInput;
    public WebElement purchaseButton;
    public WebElement okButton;

    /*
        Scenario: Make a purchase in the web store

        GIVEN a user that wants to navigate through the store and see phones, laptops and monitors
        AND add 2 laptops to the cart
        AND delete one of them
	    WHEN the order is placed with all the user and payment data
	    THEN I will obtain the information of the purchase, which includes the Id and the total amount of the purchase.
    */
    @Before
    public void setUp(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\santo\\OneDrive\\Programacion\\DemoBlazeTest\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/index.html");
    }
    @Test
    public void CustomerNavigation() throws InterruptedException {
        //Add extra time so the action shows on emulated navigator
        Thread.sleep(2000);

        //Find and click on "Phones"
        phoneButton = driver.findElement(By.linkText("Phones"));
        phoneButton.click();
        Thread.sleep(2000);

        //Find and click on "Monitors"
        monitorButton = driver.findElement(By.linkText("Monitors"));
        monitorButton.click();
        Thread.sleep(2000);

        //Find and click on "Laptops"
        laptopButton = driver.findElement(By.linkText("Laptops"));
        laptopButton.click();
        Thread.sleep(2000);

        //Find and select "Sony Vaio i5"
        sonyVaio = driver.findElement(By.linkText("Sony vaio i5"));
        sonyVaio.click();
        Thread.sleep(2000);

        //Add "Sony vaio i5" to cart
        addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();
        Thread.sleep(2000);

        //Get alert text
        alert = driver.switchTo().alert();
        alertText = driver.switchTo().alert().getText();
        assertEquals("Product added", alertText);
        driver.switchTo().alert().accept();

        //Back to Home>Laptops
        homePage = driver.findElement(By.cssSelector(".active > .nav-link"));
        homePage.click();
        Thread.sleep(2000);

        laptopButton = driver.findElement(By.linkText("Laptops"));
        laptopButton.click();
        Thread.sleep(2000);

        //Find and select "Dell i7 8gb"
        dell = driver.findElement(By.linkText("Dell i7 8gb"));
        dell.click();
        Thread.sleep(2000);

        //Add "Dell i7 8gb" to cart
        addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();
        Thread.sleep(2000);

        //Get alert text
        alert = driver.switchTo().alert();
        assertEquals("Product added", alertText);
        driver.switchTo().alert().accept();

        //Go to Cart
        cartButton = driver.findElement(By.id("cartur"));
        cartButton.click();
        Thread.sleep(7000);

        //Assertions
        //totalPurchase = driver.findElement(By.id("totalp"));
        //String totalAmount = totalPurchase.getText();
        //assertEquals("1490", totalPurchase);

        //Delete "Dell i7 8gb"
        deleteButton = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a"));
        deleteButton.click();
        Thread.sleep(4000);

        //Place Order
        placeOrder = driver.findElement(By.xpath("//button[contains(.,'Place Order')]"));
        placeOrder.click();
        Thread.sleep(2000);

        //Assertions
        //String totalOrder = driver.findElement(By.id("totalm")).getText();
        //assertEquals("Total: 790", totalOrder);

        //Fill order data
        //Name data
        nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("Laia Santos");

        //Country data
        countryInput = driver.findElement(By.id("country"));
        countryInput.sendKeys("Spain");

        //City data
        cityInput = driver.findElement(By.id("city"));
        cityInput.sendKeys("Zaragoza");

        //Card data
        cardInput = driver.findElement(By.id("card"));
        monthInput = driver.findElement(By.id("month"));
        yearInput = driver.findElement(By.id("year"));
        cardInput.sendKeys("370000000000002");
        monthInput.sendKeys("03");
        yearInput.sendKeys("2030");

        //Click on Purchase
        purchaseButton = driver.findElement(By.cssSelector("#orderModal .btn-primary"));
        purchaseButton.click();

        /*
        Log Id and Purchase
        String purchaseId = driver.findElement(By.xpath("/html/body/div[10]/p/text()[1]")).getText();
        System.out.println(purchaseId);
        String purchaseAmount = driver.findElement(By.xpath("/html/body/div[10]/p/text()[2]")).getText();
        System.out.println(purchaseAmount);
        assertEquals("Amount: 790 USD", purchaseAmount);
        */

        //Click on OK
        okButton = driver.findElement(By.xpath("//button[contains(.,'OK')]"));
        //button[contains(.,'OK')]
    }
        @After
        public void tearDown(){
            driver.quit();
        }

}
