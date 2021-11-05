import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver = null;

    public static void initialize() {
        if (driver == null) {
            if (MyConstants.browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            }
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(MyConstants.url);
    }

    public static void quit() {
        System.out.println("quitting the browser");
        driver.quit();
        driver = null;
    }

    public static void close() {
        System.out.println("closing the browser");
        driver.close();
        driver = null;
    }

    @BeforeMethod
    public void setUp() {
        TestBase.initialize();
    }

    @AfterMethod
    public void tearDown() {
        TestBase.quit();
    }
}
