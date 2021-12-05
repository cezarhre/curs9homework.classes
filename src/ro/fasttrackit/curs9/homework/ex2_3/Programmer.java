package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;

public class Programmer extends Employee{

    private String language;

    public Programmer(String language,LocalDate dateOfEmployment,String position, String fName, String lName,
                      LocalDate birthday,  String address) {
        super(dateOfEmployment,position,fName,lName,birthday,address);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }
}
