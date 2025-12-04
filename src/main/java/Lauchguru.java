import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauchguru {

    public static void main(String[] args) {

        //driver and location - old
        //System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        //new selenium will auto download the correct version of webdriver according to your browser
        WebDriver driver = new ChromeDriver();

        //path to test
        driver.get("https://demo.guru99.com/V1/index.php");

        //auto fill the username and password
        driver.findElement(By.name("uid")).sendKeys("mngr648152");
        driver.findElement(By.name("password")).sendKeys("AsuhYpu");
        driver.findElement(By.name("btnLogin")).click();

        //driver.findElement(By.linkText("Manager")).click();
    }
}
