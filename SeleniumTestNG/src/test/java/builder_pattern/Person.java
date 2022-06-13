package builder_pattern;

public class Person {

    private String gender;
    private String firstName;
    private String lastName;
    private String country;
    private double height;
    private long weight;
    private int salary;
    private String luck;
    private String potential;
    private int age;

    private Person(Builder builder) {
        this.gender = builder.gender;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.country = builder.country;
        this.height = builder.height;
        this.weight = builder.weight;
        this.age = builder.age;
        this.salary = builder.salary;
        this.luck = builder.luck;
        this.potential = builder.potential;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", salary=" + salary +
                ", luck=" + luck +
                ", potential=" + potential +
                ", age=" + age +
                '}';
    }

    public static final class Builder {
        private String gender;
        private String firstName;
        private String lastName;
        private String country;
        private double height;
        private long weight;
        private int age;
        private int salary;
        private String luck;
        private String potential;

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(long weight) {
            this.weight = weight;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder setLuck(String luck) {
            this.luck = luck;
            return this;
        }

        public Builder setPotential(String potential) {
            this.potential = potential;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
