package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentsPage {

    WebDriver driver;

    public PaymentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() throws InterruptedException {
        driver.findElement(By.linkText("Payment Gateway Project")).click();
        Thread.sleep(1000);
    }

    public void makePayment() throws InterruptedException {

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

    }
}
