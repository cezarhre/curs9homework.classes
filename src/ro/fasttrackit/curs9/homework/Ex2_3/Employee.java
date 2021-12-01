package ro.fasttrackit.curs9.homework.Ex2_3;

import java.time.LocalDate;
import java.time.Period;

public class Employee implements Person {

    protected LocalDate dateOfEmployment;
    protected String position;

    public Employee() {
        this.dateOfEmployment = LocalDate.of(2021, 11, 5);
        this.position = position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return "Helpdesk";
    }

    public String getFirstName() {
        return "POPESCU";
    }

    public String getLastName() {
        return "George";
    }

    public LocalDate getBirthday() {
        return LocalDate.of(1999,10,5);
    }

    public String getAddress() {
        return "Sesame street";
    }

    public int getAge(){
        return Period.between(getBirthday(), this.dateOfEmployment).getYears();
    }
}
