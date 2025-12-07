package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage{

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() throws InterruptedException {
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(1000); // waits for 1 second

    }

    public void fillForm() throws InterruptedException {

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
    }

    public void submit() {
        driver.findElement(By.name("submit")).click();
    }

}

