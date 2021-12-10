package ro.fasttrackit.curs9.homework.creating_classes;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String lastName, String firstName){
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
