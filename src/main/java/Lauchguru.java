import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Lauchguru {

    public static void main(String[] args) throws Exception {

        //driver and location - old
        //System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        //new selenium will auto download the correct version of webdriver according to your browser
        WebDriver driver = new ChromeDriver();

        //goto login page
        driver.get("https://demo.guru99.com/insurance/v1/index.php");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //--------------------Register------------------

        //navigate to register page
        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(1000); // waits for 1 second

        Select title = new Select(driver.findElement(By.name("title")));
        title.selectByVisibleText("Miss");
        Thread.sleep(1000);

        driver.findElement(By.name("firstname")).sendKeys("Sachini");
        Thread.sleep(1000);

        driver.findElement(By.name("lastname")).sendKeys("Weerakkody");
        Thread.sleep(1000);

        driver.findElement(By.name("phone")).sendKeys("0702838323");
        Thread.sleep(1000);

        Select year = new Select(driver.findElement(By.name("year")));
        year.selectByVisibleText("1995");
        Thread.sleep(1000);

        Select month = new Select(driver.findElement(By.name("month")));
        month.selectByVisibleText("April");
        Thread.sleep(1000);

        Select date = new Select(driver.findElement(By.name("date")));
        date.selectByVisibleText("19");
        Thread.sleep(1000);

        driver.findElement(By.id("licencetype_t")).click();
        Thread.sleep(1000);

        Select lPeriod = new Select(driver.findElement(By.name("licenceperiod")));
        lPeriod.selectByVisibleText("10");
        Thread.sleep(1000);

        Select occupation = new Select(driver.findElement(By.name("occupation")));
        occupation.selectByVisibleText("Engineer");
        Thread.sleep(1000);

        driver.findElement(By.name("street")).sendKeys("Bandaragama road");
        Thread.sleep(1000);

        driver.findElement(By.name("city")).sendKeys("Kesbewa");
        Thread.sleep(1000);

        driver.findElement(By.name("county")).sendKeys("Sri Lanka");
        Thread.sleep(1000);

        driver.findElement(By.name("post_code")).sendKeys("103000");
        Thread.sleep(1000);

        driver.findElement(By.name("email")).sendKeys("sweera19@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("123456789");
        Thread.sleep(1000);

        driver.findElement(By.name("c_password")).sendKeys("123456789");
        Thread.sleep(1000);

        driver.findElement(By.name("submit")).click();




        //---------------------Login--------------------


        driver.findElement(By.name("email")).sendKeys("sweera19@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("submit")).click();

        //Log out
        driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();



        //------------------Payment Gateway-------------------


        //driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");

        driver.findElement(By.linkText("Payment Gateway Project")).click();
        Thread.sleep(1000);

        Select quantity = new Select(driver.findElement(By.name("quantity")));
        quantity.selectByVisibleText("5");
        Thread.sleep(1000);

        //driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input")).click();
        driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("card_nmuber")).sendKeys("4690473913563512");
        Thread.sleep(1000);

        Select exmonth = new Select(driver.findElement(By.id("month")));
        exmonth.selectByVisibleText("04");
        Thread.sleep(1000);

        Select exyear = new Select(driver.findElement(By.id("year")));
        exyear.selectByVisibleText("2026");
        Thread.sleep(1000);

        driver.findElement(By.id("cvv_code")).sendKeys("179");
        Thread.sleep(1000);

        driver.findElement(By.name("submit")).click();


        //-------------Add New Customer-------------------

        //driver.get("https://demo.guru99.com/telecom/index.html");

        //navigate to new customer page
        driver.findElement(By.linkText("Telecom Project")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Add Customer")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();

        //Form Filling
        driver.findElement(By.id("fname")).sendKeys("Uresha");
        Thread.sleep(1000);
        driver.findElement(By.id("lname")).sendKeys("Perera");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("dsuweerakk19@gmail.com");
        Thread.sleep(1000);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement addressBox = wait.until(
                //ExpectedConditions.visibilityOfElementLocated(By.id("message"))
        ///);

        //driver.findElement(By.xpath("message")).sendKeys("//*[@id=\"message\"]");
        Thread.sleep(1000);
        driver.findElement(By.id("telephoneno")).sendKeys("0702838323");
        Thread.sleep(1000);
        driver.findElement(By.name("submit")).click();


    }
}
