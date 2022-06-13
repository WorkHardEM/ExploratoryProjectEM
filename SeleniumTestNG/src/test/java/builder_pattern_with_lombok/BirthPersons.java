package builder_pattern_with_lombok;

public class BirthPersons {

    public static void main(String[] args) {
        Person person = new Person()
                .age(28)
                .firstName("Max")
                .country("Ukraine")
                .gender("Boy")
                .lastName("Yevlentiev")
                .salary(10000);
        System.out.println(person.toString());
    }
}
