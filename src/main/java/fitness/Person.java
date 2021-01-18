package fitness;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private double height;
    private double weight;
    private Date createdAt;


    public Person(String firstName, String lastName, String email, int age, double height, double weight, Date createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.createdAt = createdAt;
    }
}
