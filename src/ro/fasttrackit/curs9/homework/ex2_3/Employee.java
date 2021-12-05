package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;
import java.time.Period;

public class Employee implements Person {

    protected LocalDate dateOfEmployment;
    protected String position;
    protected String fName;
    protected String lName;
    protected LocalDate birthday;
    protected String address;


    public Employee(LocalDate dateOfEmployment,String position, String fName, String lName,
                    LocalDate birthday,  String address) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.address = address;

    }
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return "Sesame street";
    }

    public int getAge(){
        return Period.between(getBirthday(), getDateOfEmployment()).getYears();
    }

}
