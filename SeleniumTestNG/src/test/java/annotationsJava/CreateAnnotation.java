package annotationsJava;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreateAnnotation {

    public static void main(String[] args) throws IllegalAccessException {
        CreateAnnotation createAnnotation = new CreateAnnotation();
        Person person = new Person();
        createAnnotation.printFieldsWithAnnotationShow(person, person.getClass());
        createAnnotation.printMethodsWithAnnotationShow(person.getClass());
    }

    void printMethodsWithAnnotationShow(Class c) {
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(Show.class)) {
                    System.out.println("Method: " + method.getName());
                }
            }
        }
    }

     void printFieldsWithAnnotationShow(Object o, Class c) throws IllegalAccessException {
         Field[] fields = c.getDeclaredFields();
         for (Field field : fields) {
             Annotation[] annotations = field.getDeclaredAnnotations();
             for (Annotation annotation : annotations) {
                 if (annotation.annotationType().equals(Show.class)) {
                     System.out.println("Field: " + field.get(o));
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
    @Show
    int age = 18;
    @Show
    String mood = "Good";

    @Show
    public void eat() {

    }
}
