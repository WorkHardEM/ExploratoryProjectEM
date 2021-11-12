package builderPatternWithLombok;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)
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

}
