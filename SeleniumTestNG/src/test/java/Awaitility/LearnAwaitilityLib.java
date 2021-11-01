package Awaitility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class LearnAwaitilityLib {

    private int countRun = 0;

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
}
