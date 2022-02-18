package awaitility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class LearnAwaitilityLib {

    ChromeDriver driver = new ChromeDriver();
    private int countRun = 0;
    private String URL = "https://auto.ria.com/uk/";
    By sellBtn = By.cssSelector("a>[aria-label='Продати авто']");

    @Test
    public void awaitilityRun() {
        await().atMost(30, TimeUnit.SECONDS).pollInterval(1, TimeUnit.SECONDS)
                .until(() -> getFalse());
    }

    public Boolean getFalse() {
        countRun++;
        System.out.println(countRun);
        if (countRun > 28) {
            return true;
        }
        return false;
    }

    @Test
    public void awaitilityWithUntil() {
        driver.get(URL);
        await("Wait for the sell button to be displayed").atMost(30, TimeUnit.SECONDS)
                .ignoreExceptions()
                .until(driver.findElement(sellBtn)::isDisplayed);
    }

    @Test
    public void awaitilityWithAssert() {
        driver.get(URL);
        await().atMost(30, TimeUnit.SECONDS)
                .ignoreExceptions()
                .untilAsserted(() -> Assert.assertEquals(driver.findElement(sellBtn).isDisplayed(), true,
                        "Wait for the sell button to be displayed"));
        driver.findElement(sellBtn).click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
