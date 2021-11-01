import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FastTestMethods {

    @Test
    public void testRunWebDriver() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

}
