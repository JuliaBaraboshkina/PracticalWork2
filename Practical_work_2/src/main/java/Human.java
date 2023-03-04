import java.time.LocalDate;

public class Human {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final LocalDate birthDate;
    private final int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.weight =weight;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.firstName;
    }
    public String getLastName() {return this.lastName;}
    public LocalDate getDate() {
        return this.birthDate;
    }
    public int getWeight() {
        return this.weight;
    }
}