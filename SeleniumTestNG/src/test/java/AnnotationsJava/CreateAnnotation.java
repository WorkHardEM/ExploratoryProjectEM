package AnnotationsJava;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class CreateAnnotation {

    public static void main(String[] args) throws IllegalAccessException {
        CreateAnnotation createAnnotation = new CreateAnnotation();
        Person person = new Person();
        createAnnotation.print(person, person.getClass());
    }

     void print(Object o, Class c) throws IllegalAccessException {
         Field[] fields = c.getDeclaredFields();
         for (Field field : fields) {
             Annotation[] annotations = field.getDeclaredAnnotations();
             for (Annotation annotation : annotations) {
                 if (annotation.annotationType().equals(Show.class)) {
                     System.out.println(field.get(o));
                 }
             }
         }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Show{
    boolean value() default true;
}

class Person {
    @Show
    String name = "Max";
    int age = 18;
}
