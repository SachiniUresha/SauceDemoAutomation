package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {

    WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() throws InterruptedException {
        driver.findElement(By.linkText("Telecom Project")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Add Customer")).click();
        Thread.sleep(1000);
    }

    public void fillForm() throws InterruptedException {
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
    }

    public void submit(){
        driver.findElement(By.name("submit")).click();
    }
}
