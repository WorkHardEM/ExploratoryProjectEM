package annotationsTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAfterClass {

    ChromeDriver driver = new ChromeDriver();
    WebDriverWait webDriverWait = new WebDriverWait(driver, 5);

    @BeforeMethod
    public void openPage() {
        driver.get("https://www.google.com/");
        webDriverWait.until(ExpectedConditions.urlContains("fefrereger"));
    }

    @Test
    public void testRunWebDriver() {
        webDriverWait.until(ExpectedConditions.urlContains("fefrereger"));
    }

    @Test
    public void testRunWebDriver2() {
        webDriverWait.until(ExpectedConditions.urlContains("fefrereger"));
    }

    @Test
    public void testRunWebDriver3() {
        webDriverWait.until(ExpectedConditions.urlContains("fefrereger"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        System.out.println("END");
    }
}
