package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* https://www.youtube.com/watch?v=7eYQPNNxLSM&ab_channel=%D0%A3%D1%80%D0%BE%D0%BA%D0%B8Java */

public class LearnReflection {
    public static void main(String[] args) {
        Class clss = SomeClass.class;

        Constructor[] constructors = clss.getDeclaredConstructors();
        System.out.println("\nCONSTRUCTORS:");
        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
        }

        Field[] fields = clss.getDeclaredFields();
        System.out.println("\nFIELDS:");
        for (Field field : fields) {
            System.out.println("Field: " + Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
        }

        Method[] methods = clss.getDeclaredMethods();
        System.out.println("\nMETHODS:");
        for (Method method : methods) {
            System.out.println("Method: " + Modifier.toString(method.getModifiers()) + " " + method.getName());
        }
    }

}

class SomeClass {
    private static transient int i;
    private String s;
    Boolean test = false;

    SomeClass(String s) {
        this.s = s;
    }

    private String someMethod2(String s) {
        System.out.println("this is " + s);
        return s;
    }

    protected String someMethod3(String s) {
        System.out.println("this is " + s);
        return s;
    }

    public String someMethod(String s) {
        System.out.println("this is " + s);
        return s;
    }
}
