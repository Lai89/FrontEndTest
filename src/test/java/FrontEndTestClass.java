import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrontEndTestClass {
    private  static WebDriver driver;
    public WebElement phoneButton;
    public WebElement monitorButton;
    public WebElement laptopButton;
    public WebElement sonyVaio;

    public WebElement dell;
    public WebElement addToCart;
    public WebElement cartButton;
    public WebElement totalPurchase;
    public WebElement Assertion;


    @Before
    public void setUp(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\santo\\OneDrive\\Programacion\\DemoBlazeTest\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
    }
    @Test
    public void CustomerNavigation() throws InterruptedException {
        //Permite ver la acción en el navegador emulado
        Thread.sleep(2000);
        //busca el elemento en la página
        phoneButton = driver.findElement(By.id("itemc"));
        phoneButton.click();
        Thread.sleep(2000);
        monitorButton = driver.findElement(By.linkText("/html/body/div[5]/div/div[1]/div/a[4]"));
        Thread.sleep(7000);
//        laptopButton = driver.findElement(By.linkText("/html/body/div[5]/div/div[1]/div/a[3]"));
//        Thread.sleep(7000);
//        monitorButton = driver.findElement(By.linkText("/html/body/div[5]/div/div[1]/div/a[4]"));
//        Thread.sleep(7000);
//        sonyVaio = driver.findElement(By.linkText("Sony vaio i5"));
//        Thread.sleep(7000);
//        addToCart = driver.findElement(By.linkText("linkText=Add to cart"));
//        Thread.sleep(7000);
//        //www.demoblaze.com says
//        assertEquals("Product Added", driver.getTitle());
//
//        dell = driver.findElement(By.linkText("Dell i7 8gb"));
//        Thread.sleep(7000);
//        addToCart = driver.findElement(By.linkText("Dell i7 8gb"));
//        Thread.sleep(7000);
//        //www.demoblaze.com says
//        assertEquals("Product Added", driver.getTitle());
//
//        cartButton = driver.findElement(By.id("Cartur"));
//        totalPurchase = driver.findElement(By.className("panel-title"));
//        String totalAmount = totalPurchase.getText();
//
//        assertEquals("1490", totalAmount);

        //Buscar elemento en la página
        //WebElement searchbox = driver.findElement(By.name(""));
        //Limpiar texto
        //searchbox.clear();
        //escribir en el navegador
        //searchbox.sendKeys();
        //enviar acción
        //searchbox.submit();

        //tiempo de espera
        //driver.manage().timeouts().getImplicitWaitTimeout(10, TimeUnit.SECONDS);

        //assertEquals("titulo página", driver.getTitle());

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
