package factory_test_ng.factory_annotation;

import org.testng.annotations.Factory;

public class SimpleTestFactoryTest {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new SimpleTest("one"),
                new SimpleTest("two")
        };
    }
}
