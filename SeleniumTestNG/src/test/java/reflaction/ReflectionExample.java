package reflaction;

import reflaction.rabbit.Rabbit;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionChecker checker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();

//        checker.showClassName(rabbit);
//        checker.showClassFields(rabbit);
//        checker.showClassMethods(checker);
//        checker.showFieldsAnnotations(rabbit);

        Object clone = checker.createNewObject(rabbit);
        checker.showClassName(clone);
    }
}
