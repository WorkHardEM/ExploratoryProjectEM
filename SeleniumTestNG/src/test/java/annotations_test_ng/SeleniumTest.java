package annotations_test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SeleniumTest {

    private ChromeDriver driver = new ChromeDriver();
    private Actions actions = new Actions(driver);
    private WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
    private JavascriptExecutor js = driver;

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        Thread.sleep(2000);
        WebElement dragMeToMyTarget = driver.findElement(By.cssSelector(".ui-draggable-handle"));
        WebElement dropHere = driver.findElement(By.cssSelector(".ui-widget-header"));
        actions.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
    }

    @Test
    public void dragAndDrop2Test() throws InterruptedException {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        Thread.sleep(2000);
        WebElement dragMeToMyTarget = driver.findElement(By.cssSelector(".ui-draggable-handle"));
        WebElement dropHere = driver.findElement(By.cssSelector(".ui-widget-header"));
        actions.clickAndHold(dragMeToMyTarget).moveToElement(dropHere).release().build().perform();
    }

    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("https://products.groupdocs.app/ru/conversion/total");
        Thread.sleep(2000);
        WebElement input = driver.findElement(By.id("fileDropRef"));
        String filePath = "C:\\Users\\Maksym\\Desktop\\documents\\file2upload.pdf";
        input.sendKeys(filePath);
    }

    @Test
    public void newTabTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        js.executeScript("window.open()");
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.get("https://www.google.com/");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        driver.get("https://www.google.com/search?q=tabs");
    }

    @Test
    public void switchToIframeTest() throws InterruptedException {
        driver.get("https://iframetester.com/");
        Thread.sleep(2000);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("iframe-window")));
        webDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframe-window")));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
