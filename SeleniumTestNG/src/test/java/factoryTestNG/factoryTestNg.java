package factoryTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class factoryTestNg {

    private WebDriver driver;
    String plan = "";
    String user = "";

    @DataProvider()
    private Object[][] plans() {
        return new Object[][]{
                new Object[]{"FREE"},
                new Object[]{"PLUS"},
                new Object[]{"PREMIUM"}
        };
    }


    @BeforeTest()
    public void setUp() {
        driver = new ChromeDriver();
        switch (plan) {
            case "FREE":
                System.out.println("Do FREE user");
                break;
            case "PLUS":
                System.out.println("Do PLUS user");
                break;
            case "PREMIUM":
                System.out.println("Do PREMIUM user");
                break;
        }
    }

    @Test()
    public void exampleTest() {
        System.out.println(user + " " + plan);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
