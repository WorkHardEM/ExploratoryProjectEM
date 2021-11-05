package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* https://www.youtube.com/watch?v=7eYQPNNxLSM&ab_channel=%D0%A3%D1%80%D0%BE%D0%BA%D0%B8Java */

public class LearnReflection {
    public static void main(String[] args) {
        Class clss = SomeClass.class;
        Constructor[] constructors = clss.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
        }

        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }

}

class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {
    }

    SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this is " + s);
        return s;
    }
}
