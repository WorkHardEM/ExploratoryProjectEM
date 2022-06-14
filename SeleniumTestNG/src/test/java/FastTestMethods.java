import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Math.ceil;
import static java.lang.Math.random;

public class FastTestMethods {

    @Test
    public void testRunWebDriver() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test
    public void startPlay() {
        System.out.println("Start of investment ... Good Luck !!!");
        double percent = 0.13;
        double startBank = 10.00;
        double currentBank = 10.00;
        int failedNumber = placeBet();

        int x = 0;
        while (x < 1000) {
            int probability = placeBet();
            if (probability != failedNumber) {
                currentBank = currentBank * percent + currentBank;
            } else {
                System.out.println("YOU LOST EVERYTHING :(\nBANK: " + ceil(currentBank) + "\nATTEMPTS: " + x);
                System.out.println("Increase: " + ceil(currentBank / startBank));
                break;
            }
            x++;
        }


    }

    public static int placeBet() {
        return 1 + (int) (random() * 88);
    }
}
