package ro.fasttrackit.curs9.homework.ex3;

import ro.fasttrackit.curs9.homework.creating_classes.Person;
import ro.fasttrackit.curs9.homework.ex2_3.Employee;

import java.time.LocalDate;
import java.time.Period;

public class AltPerson {

    public Employee altPerson;

    public AltPerson(Employee altPerson) {
        this.altPerson = altPerson;
    }
    public String getFullName() {
        return altPerson.getFirstName() + " " + altPerson.getLastName();
    }

    public int getYear(){
        return Period.between(altPerson.getBirthday(),LocalDate.now()).getYears();
    }

    public int getAgeAtEmployment(){
        return Period.between((altPerson.getBirthday()), altPerson.getDateOfEmployment()).getYears();
    }

}