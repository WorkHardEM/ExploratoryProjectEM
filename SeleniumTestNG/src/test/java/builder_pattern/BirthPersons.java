package builder_pattern;

public class BirthPersons {

    public static void main(String[] args) {
            Person person = new Person.Builder()
                    .setWeight(60)
                    .setGender("Boy")
                    .setAge(29)
                    .setCountry("Ukraine")
                    .setFirstName("Max")
                    .setHeight(1.76)
                    .setLastName("Yevlentiev")
                    .setLuck("lucky")
                    .setPotential("high")
                    .setSalary(10000)
                    .build();
        System.out.println(person.toString());
    }
}
