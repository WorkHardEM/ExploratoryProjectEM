import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase{

    @Test(priority = 1)
    public void verifyTestClass() {
       String title = driver.getTitle();
       System.out.println("Page title is: " + title);
       Assert.assertEquals(title, MyConstants.loginPageTitle);
    }

    @Test(priority = 2)
    public void logoTest() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }

    @Test(priority = 2)
    public void logoTest2() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }
    @Test(priority = 2)
    public void logoTest3() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }
    @Test(priority = 2)
    public void logoTest4() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }
    @Test(priority = 2)
    public void logoTest5() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }
    @Test(priority = 2)
    public void logoTest6() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='free crm home']")).isDisplayed());
    }
}
