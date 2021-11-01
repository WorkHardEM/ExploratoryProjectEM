package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class LearnAnnotations {

    public static void main(String[] args) {

    }
}

@Deprecated
class MyClass {

    @Deprecated
    int i;

    @Deprecated
    MyClass() {

    }

    @Deprecated
    public void method(@Deprecated int i) {
        @Deprecated
        int j;

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE}) // аннотация применима толька к полям и локальным переменным
@interface MyAnn {
    boolean run() default true;
    int i() default 1;
    String value();
}
