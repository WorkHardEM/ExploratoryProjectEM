package factory_test_ng.factory_annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {

    private String param = "";

    public SimpleTest(String param) {
        this.param = param;
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class executed");
    }

    @Test
    public void testMethod() {
        System.out.println("test Method parameter value is: " + param);
    }
}
