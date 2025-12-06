import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



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

        driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();








        //-------------Add New Customer-------------------

        //navigate to new customer page
        //driver.findElement(By.linkText("New Customer")).click();

        //Form Filling
        //driver.findElement(By.name("name")).sendKeys("Sachini");
        //driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
        //driver.findElement(By.id("dob")).sendKeys("19042001");
        //driver.findElement(By.name("addr")).sendKeys("225/B, Walawwatta, Kesbewa.");
        //driver.findElement(By.name("city")).sendKeys("Piliyandala");
        //driver.findElement(By.name("state")).sendKeys("Western");
        //driver.findElement(By.name("pinno")).sendKeys("103000");
        //driver.findElement(By.name("telephoneno")).sendKeys("0702838323");
        //driver.findElement(By.name("emailid")).sendKeys("dsuweerakkody19@gmail.com");
        //driver.findElement(By.name("sub")).click();





    }
}
