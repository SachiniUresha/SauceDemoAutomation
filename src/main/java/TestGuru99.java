import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddCustomerPage;
import pages.LoginPage;
import pages.PaymentsPage;
import pages.RegisterPage;


public class TestGuru99 {

    public static void main(String[] args) throws Exception {

        //driver and location - old
        //System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        //new selenium will auto download the correct version of webdriver according to your browser
        WebDriver driver = new ChromeDriver();

        //navigate to page
        driver.get("https://demo.guru99.com/insurance/v1/index.php");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //--------------------Register------------------

        RegisterPage register = new RegisterPage(driver);
        register.open();
        register.fillForm();
        register.submit();

        //-------------------Login------------------------

        LoginPage login = new LoginPage(driver);
        login.login("sweera19@gmail.com","123456789");
        login.logout();

        //-------------------Payment------------------------

        PaymentsPage payment = new PaymentsPage(driver);
        payment.open();
        payment.makePayment();

        //--------------------Add Customer---------------------

        AddCustomerPage addCustomer = new AddCustomerPage(driver);
        addCustomer.open();
        addCustomer.fillForm();
        addCustomer.submit();

        driver.quit();


    }
}
