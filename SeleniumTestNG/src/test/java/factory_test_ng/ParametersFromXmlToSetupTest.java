package factory_test_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParametersFromXmlToSetupTest {

    private WebDriver driver;
    String plan = null;
    String user = null;

    @BeforeTest()
    @Parameters("PLAN")
    public void setUp(String plan) {
        this.plan = plan;
        driver = new ChromeDriver();
        switch (plan) {
            case "FREE":
                user = "MY_FREE";
                break;
            case "PLUS":
                user = "MY_PLUS";
                break;
            case "PREMIUM":
                user = "MY_PREMIUM";
                break;
        }
    }

    @Test()
    public void exampleTest() {
        System.out.println(plan);
        System.out.println(user);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
