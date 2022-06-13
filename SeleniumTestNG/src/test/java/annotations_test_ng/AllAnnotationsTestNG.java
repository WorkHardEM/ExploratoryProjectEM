package annotations_test_ng;

import org.testng.annotations.*;

public class AllAnnotationsTestNG {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeGroups("regression")
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeMethod(onlyForGroups = "regression")
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups = "regression", description = "описание")
    public void test() {
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterGroups("regression")
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
